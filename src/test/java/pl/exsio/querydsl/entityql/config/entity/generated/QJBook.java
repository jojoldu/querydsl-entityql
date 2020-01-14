package pl.exsio.querydsl.entityql.config.entity.generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.PrimaryKey;
import pl.exsio.querydsl.entityql.QColumnMetadataFactory;
import pl.exsio.querydsl.entityql.QPathConfig;
import pl.exsio.querydsl.entityql.QPathFactory;
import pl.exsio.querydsl.entityql.QStaticModel;

import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
public final class QJBook extends QStaticModel<pl.exsio.querydsl.entityql.config.entity.JBook> {

  public static final QJBook INSTANCE = new QJBook();

  public final NumberPath<java.lang.Long> id;

  public final StringPath name;

  public final StringPath desc;

  public final NumberPath<java.math.BigDecimal> price;

  public final PrimaryKey<pl.exsio.querydsl.entityql.config.entity.JBook> _primaryKey;

  public QJBook() {
    this("JBOOKS");
  }

  @SuppressWarnings(value = "unchecked")
  public QJBook(String variable) {
    super(pl.exsio.querydsl.entityql.config.entity.JBook.class, variable, "", "JBOOKS");

    id:
    {
      QPathConfig config =
          new QPathConfig(java.lang.Long.class, java.lang.Long.class, "BOOK_ID", true, 1, -5);

      this.id = QPathFactory.<NumberPath<java.lang.Long>>create(this, config);

      addMetadata(this.id, QColumnMetadataFactory.create(config));
    }

    name:
    {
      QPathConfig config =
          new QPathConfig(java.lang.String.class, java.lang.String.class, "NAME", true, 2, 12);

      this.name = QPathFactory.<StringPath>create(this, config);

      addMetadata(this.name, QColumnMetadataFactory.create(config));
    }

    desc:
    {
      QPathConfig config =
          new QPathConfig(java.lang.String.class, java.lang.String.class, "DESC", true, 3, 2005);

      this.desc = QPathFactory.<StringPath>create(this, config);

      addMetadata(this.desc, QColumnMetadataFactory.create(config));
    }

    price:
    {
      QPathConfig config =
          new QPathConfig(
              java.math.BigDecimal.class, java.math.BigDecimal.class, "PRICE", true, 4, 3);

      this.price = QPathFactory.<NumberPath<java.math.BigDecimal>>create(this, config);

      addMetadata(this.price, QColumnMetadataFactory.create(config));
    }

    _primaryKey:
    {
      List<Path> paths = new ArrayList();

      paths.add(this.id);

      this._primaryKey =
          this.<pl.exsio.querydsl.entityql.config.entity.JBook>createPrimaryKey(
              paths.<Path>toArray(new Path[0]));
    }
  }
}
