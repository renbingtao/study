package rbt;

import lombok.*;
import lombok.extern.log4j.Log4j;

@ToString(of = {"name", "age"}, exclude = {"name"}, callSuper = true, includeFieldNames = false, doNotUseGetters = true)
@EqualsAndHashCode
@NoArgsConstructor
@Data

public class Study {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String age;
    @Getter
    @Setter
    private String grade;

    public static void main(String[] args) {
        Study study = new Study();
        study.hashCode();
        System.out.println(study.canEqual(new Study()));
        System.out.println(study.toString());

    }
}
