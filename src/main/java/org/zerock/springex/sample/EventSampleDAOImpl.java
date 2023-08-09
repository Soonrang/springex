package org.zerock.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

// SampleService에 필요한 SampleDAO 타입의 빈이 두개가 됨 > test가 어떤걸 실행해야하는지 몰라한다.
@Repository
@Qualifier("event")
public class EventSampleDAOImpl implements SampleDAO {

}
