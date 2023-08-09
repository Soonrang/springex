package org.zerock.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

// Repository를 이용해 해당 클래스의 객체를 스프링 Bean처리되게 구성
// 느슨한 결합(loose coupling): SampleDAO 타입의 객체를 다른 객체로 변경해도 SampleService 타입을 이용하는 코드를 수정할 일  없다.
@Repository
@Qualifier("normal")
public class SampleDAOImpl implements SampleDAO {
}
