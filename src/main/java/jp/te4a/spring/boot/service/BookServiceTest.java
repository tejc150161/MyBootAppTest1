package jp.te4a.spring.boot.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import jp.te4a.spring.boot.BookApplication;
import jp.te4a.spring.boot.form.BookForm;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BookApplication.class)
@WebAppConfiguration
public class BookServiceTest {
    @Autowired
    BookService bookService;
    @Test
    public void testCreate() throws Exception {
    BookForm bookForm = new BookForm();
    bookForm.setId(0);
    bookForm.setTitle("テストタイトル");
    bookForm.setWritter("テスト作者");
    bookForm.setPublisher("テスト出版社");
    bookForm.setPrice(100);
    
    assertThat(bookForm, is(bookService.create(bookForm)));
    }
}

