package pl.exsio.querydsl.entityql.config.entity.it.generated

import com.querydsl.core.types.Path
import com.querydsl.core.types.dsl.NumberPath
import com.querydsl.sql.ForeignKey
import com.querydsl.sql.PrimaryKey
import pl.exsio.querydsl.entityql.QColumnMetadataFactory
import pl.exsio.querydsl.entityql.QPathConfig
import pl.exsio.querydsl.entityql.QPathFactory
import pl.exsio.querydsl.entityql.QStaticModel

/**
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
@groovy.transform.CompileStatic
public final class QOrderItem
    extends QStaticModel<pl.exsio.querydsl.entityql.config.entity.it.OrderItem> {

  public static final QOrderItem INSTANCE = new QOrderItem();

  public final NumberPath<java.lang.Long> id;

  public final NumberPath<java.lang.Long> quantity;

  public final NumberPath<java.lang.Long> bookId;

  public final NumberPath<java.lang.Long> orderId;

  public final ForeignKey<pl.exsio.querydsl.entityql.config.entity.it.Book> book;

  public final ForeignKey<pl.exsio.querydsl.entityql.config.entity.it.Order> order;

  public final PrimaryKey<pl.exsio.querydsl.entityql.config.entity.it.OrderItem> _primaryKey;

  public QOrderItem() {
    this("ORDER_ITEMS");
  }

  @SuppressWarnings(value = "unchecked")
  public QOrderItem(String variable) {
    super(pl.exsio.querydsl.entityql.config.entity.it.OrderItem.class, variable, "", "ORDER_ITEMS");

    id:
    {
      QPathConfig config =
          new QPathConfig(java.lang.Long.class, java.lang.Long.class, "ORDER_ITEM_ID", true, 1, -5);

      this.id = QPathFactory.<NumberPath<java.lang.Long>>create(this, config);

      addMetadata(this.id, QColumnMetadataFactory.create(config));
    }

    quantity:
    {
      QPathConfig config =
          new QPathConfig(java.lang.Long.class, java.lang.Long.class, "QTY", false, 4, -5);

      this.quantity = QPathFactory.<NumberPath<java.lang.Long>>create(this, config);

      addMetadata(this.quantity, QColumnMetadataFactory.create(config));
    }

    bookId:
    {
      QPathConfig config =
          new QPathConfig(java.lang.Long.class, java.lang.Long.class, "BOOK_ID", false, 2, -5);

      this.bookId = QPathFactory.<NumberPath<java.lang.Long>>create(this, config);

      addMetadata(this.bookId, QColumnMetadataFactory.create(config));
    }

    orderId:
    {
      QPathConfig config =
          new QPathConfig(java.lang.Long.class, java.lang.Long.class, "ORDER_ID", false, 3, -5);

      this.orderId = QPathFactory.<NumberPath<java.lang.Long>>create(this, config);

      addMetadata(this.orderId, QColumnMetadataFactory.create(config));
    }

    book:
    {
      this.book =
          this.<pl.exsio.querydsl.entityql.config.entity.it.Book>createForeignKey(
              this.bookId, "BOOK_ID");
    }

    order:
    {
      this.order =
          this.<pl.exsio.querydsl.entityql.config.entity.it.Order>createForeignKey(
              this.orderId, "ORDER_ID");
    }

    _primaryKey:
    {
      List<Path> paths = new ArrayList();

      paths.add(this.id);

      this._primaryKey =
          this.<pl.exsio.querydsl.entityql.config.entity.it.OrderItem>createPrimaryKey(
              paths.<Path>toArray(new Path[0]));
    }
  }
}
