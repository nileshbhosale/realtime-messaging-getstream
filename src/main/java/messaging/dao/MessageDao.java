package messaging.dao;


import messaging.domain.Message;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Nilesh Bhosale
 */
@Transactional
public interface MessageDao extends CrudRepository<Message, Long> {
}
