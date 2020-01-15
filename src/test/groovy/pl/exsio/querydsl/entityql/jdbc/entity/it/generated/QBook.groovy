package pl.exsio.querydsl.entityql.jdbc.entity.it.generated

import com.querydsl.core.types.Path
import com.querydsl.core.types.dsl.NumberPath
import com.querydsl.core.types.dsl.StringPath
import com.querydsl.sql.PrimaryKey
import groovy.transform.CompileStatic
import pl.exsio.querydsl.entityql.QColumnMetadataFactory
import pl.exsio.querydsl.entityql.QPathConfig
import pl.exsio.querydsl.entityql.QPathFactory
import pl.exsio.querydsl.entityql.QStaticModel
import pl.exsio.querydsl.entityql.jdbc.entity.it.Book

/**
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
@CompileStatic
public final class QBook extends QStaticModel<Book> {

  public static final QBook INSTANCE = new QBook();

  public final NumberPath<Long> id;

  public final StringPath name;

  public final StringPath desc;

  public final NumberPath<BigDecimal> price;

  public final PrimaryKey<Book> _primaryKey;

  public QBook() {
    this("BOOKS");
  }

  @SuppressWarnings(value = "unchecked")
  public QBook(String variable) {
    super(Book.class, variable, "", "BOOKS");

    id:
    {
      QPathConfig config = new QPathConfig(Long.class, Long.class, "BOOK_ID", true, 1, -5);

      this.id = QPathFactory.<NumberPath<Long>>create(this, config);

      addMetadata(this.id, QColumnMetadataFactory.create(config));
    }

    name:
    {
      QPathConfig config = new QPathConfig(String.class, String.class, "NAME", true, 2, 12);

      this.name = QPathFactory.<StringPath>create(this, config);

      addMetadata(this.name, QColumnMetadataFactory.create(config));
    }

    desc:
    {
      QPathConfig config = new QPathConfig(String.class, String.class, "DESC", true, 3, 12);

      this.desc = QPathFactory.<StringPath>create(this, config);

      addMetadata(this.desc, QColumnMetadataFactory.create(config));
    }

    price:
    {
      QPathConfig config = new QPathConfig(BigDecimal.class, BigDecimal.class, "PRICE", true, 4, 3);

      this.price = QPathFactory.<NumberPath<BigDecimal>>create(this, config);

      addMetadata(this.price, QColumnMetadataFactory.create(config));
    }

    _primaryKey:
    {
      List<Path> paths = new ArrayList();

      paths.add(this.id);

      this._primaryKey = this.<Book>createPrimaryKey(paths.<Path>toArray(new Path[0]));
    }
  }
}
