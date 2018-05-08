package bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * Created by Administrator on 2018/5/8.
 */
@Data//自动生成getter setter
@Builder//特殊的构造器，可以实现链式构造
@NoArgsConstructor//无参构造函数
@AllArgsConstructor//有参构造函数
public class Student {
    @Id//表的主键
    private Integer sid;
    private String username;
    private String password;
    private Integer did;
}
