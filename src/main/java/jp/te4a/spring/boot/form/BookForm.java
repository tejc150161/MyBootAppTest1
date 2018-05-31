package jp.te4a.spring.boot.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jp.te4a.spring.boot.validate.EcheckValid;
import jp.te4a.spring.boot.validate.Writter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookForm {
	private Integer id ;
	@NotNull
	@Size(min=3)
	@EcheckValid(param = "abc")
	private String title;
	@Size(min=3, max=20)
	@Writter(ok ="東北タロウ")
	private String writter;
	private String publisher;
	@Min(0)
	private Integer price;

}
