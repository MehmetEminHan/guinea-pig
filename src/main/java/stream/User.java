package stream;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private Integer id;
    private String eMail;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", eMail='" + eMail + '\'' +
                ", name='" + name + '\'' +
                '}' + "\n";
    }

    public void talk(){
        System.out.println("Hi my name is "+getName());

    }
}
