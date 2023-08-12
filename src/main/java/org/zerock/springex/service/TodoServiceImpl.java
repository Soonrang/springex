package org.zerock.springex.service;

//TodoService 인터페이스를 구현하는 TodoServiceImpl이다
// 여기에 의존성을 주입하여 데이터베이스 처리를 한다.
// TodoMapper DTO, VO 변환을 처리하는 MdoelMapper주입

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zerock.springex.domain.TodoVO;

import org.zerock.springex.dto.TodoDTO;
import org.zerock.springex.mapper.TodoMapper;

import java.util.List;
import java.util.stream.Collectors;
@Service
@Log4j2
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
//    // 의존성 주입이 필요한 객체 타입을 final로 고정한다.
//    // @Require~을 이용하여 생성자를 생성한다.
//    private final TodoMapper todoMapper;
//    private final ModelMapper modelMapper;
//
//
//    // register에서는 ModelMapper을 이용해서 TodoDTO를 TodoVO로 변환
//    // TodoMapper을 이용해서 insert 처리하게됨
//    @Override
//    public void register(TodoDTO todoDTO) {
//
//        log.info(modelMapper);
//        // 변환!
//        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
//        log.info(todoVO);
//        todoMapper.insert(todoVO);
//    }


    private final TodoMapper todoMapper;

    private final ModelMapper modelMapper;

    @Override
    public void register(TodoDTO todoDTO) {

        log.info(modelMapper);

        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class );

        log.info(todoVO);

        todoMapper.insert(todoVO);

    }

    @Override
    public List<TodoDTO> getAll() {

        List<TodoDTO> dtoList = todoMapper.selectAll().stream()
                .map(vo -> modelMapper.map(vo, TodoDTO.class))
                .collect(Collectors.toList());

        return dtoList;
    }

    @Override
    public TodoDTO getOne(Long tno) {
        TodoVO todoVO = todoMapper.selectOne(tno);
        TodoDTO todoDTO = modelMapper.map(todoVO, TodoDTO.class);
        return todoDTO;

    }

    @Override
    public void remove(Long tno) {
        todoMapper.delete(tno);
    }

    @Override
    public void modify(TodoDTO todoDTO) {
        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
        todoMapper.update(todoVO);
    }
}
