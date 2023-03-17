package send.email;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("mySQLDataSource")
public class MySQLDataSource implements DataSource{
    String[] emailIDs;
    public MySQLDataSource(){
        this.emailIDs = new String[]{"dka111,dkw333"};
    }

    @Override
    public String[] getEmails() {
        return emailIDs;
    }
}
