package web.utils.modals;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Products {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String title;
  long price;

  protected  Products() {}

  public Products( String title, long price) {

    this.title = title;
    this.price = price;
  }

    public String getTitle() {
        return title;
    }

    public long getPrice() {
        return price;
    }

    @Override
  public String toString() {
    return "Products{" + "id=" + id + ", title='" + title + '\'' + ", price=" + price + '}';
  }
}
