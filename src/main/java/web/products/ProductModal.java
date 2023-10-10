//package web.products;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import java.sql.SQLException;
//
//public class ProductModal {
//  @Autowired private JdbcTemplate template;
//
//  /**
//   * Constructor
//  make sure table always exists
//   */
//  public ProductModal() throws SQLException {
//      createTable();
//  }
//
//  public void createTable() throws SQLException {
//    try {
//      template.execute(
//          "CREATE TABLE IF NOT EXISTS products (id SERIAL PRIMARY KEY, name VARCHAR(255), price int)");
//    } catch (Exception e) {
//      System.out.println("Error Table creating");
//      System.out.println(e);
//    }
//  }
//
//  public void addProduct() {}
//
//  public void getProducts() {
//    System.out.println("Hello Product");
//  }
//}
