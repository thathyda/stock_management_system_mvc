 /*MVC
  * M= model
  *   - DAO : Data Access Object
  *   - CO_Cs-tad.Service Implement
  *       * CO_Cs-tad.Service interface
  *       * ServiceImpl
  *   - DTO : Data Transfer Object
  * V = CO_Cs-tad.View
  * C = Controller (Dispatcher Servlet)
  * General : base Path term Architecture
  * Lom book bowlderPlatCode  */


 package co.model;

import java.time.LocalDate;

public class Product {
    private Long id;
    private String name;
    private Integer qty;
    private Double price;
    private LocalDate importedDate;

    public Product() {
    }

    public Product(Long id, String name, Integer qty, Double price, LocalDate importedDate) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.importedDate = importedDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", importedDate=" + importedDate +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getImportedDate() {
        return importedDate;
    }

    public void setImportedDate(LocalDate importedDate) {
        this.importedDate = importedDate;
    }
}
