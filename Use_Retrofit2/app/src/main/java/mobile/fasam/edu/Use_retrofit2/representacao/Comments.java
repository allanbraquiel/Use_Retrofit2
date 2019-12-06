package mobile.fasam.edu.Use_retrofit2.representacao;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

    @Data
    @ToString
    @Builder
    public class Comments {
        private Integer postId;
        private Integer id;
        private String name;
        private String email;
        private String body;
    }
