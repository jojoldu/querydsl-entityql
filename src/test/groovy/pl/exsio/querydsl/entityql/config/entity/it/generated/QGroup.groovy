package pl.exsio.querydsl.entityql.config.entity.it.generated

import com.querydsl.core.types.Path
import com.querydsl.core.types.dsl.NumberPath
import com.querydsl.core.types.dsl.StringPath
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
public final class QGroup extends QStaticModel<pl.exsio.querydsl.entityql.config.entity.it.Group> {

  public static final QGroup INSTANCE = new QGroup();

  public final NumberPath<java.lang.Long> id;

  public final StringPath name;

  public final StringPath adminId;

  public final ForeignKey<pl.exsio.querydsl.entityql.config.entity.it.GroupAdmin> admin;

  public final PrimaryKey<pl.exsio.querydsl.entityql.config.entity.it.Group> _primaryKey;

  public QGroup() {
    this("GROUPS");
  }

  @SuppressWarnings(value = "unchecked")
  public QGroup(String variable) {
    super(pl.exsio.querydsl.entityql.config.entity.it.Group.class, variable, "", "GROUPS");

    id:
    {
      QPathConfig config =
          new QPathConfig(java.lang.Long.class, java.lang.Long.class, "GROUP_ID", true, 1, -5);

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

    adminId:
    {
      QPathConfig config =
          new QPathConfig(
              java.lang.String.class, java.lang.String.class, "ADMIN_NAME", false, 4, 12);

      this.adminId = QPathFactory.<StringPath>create(this, config);

      addMetadata(this.adminId, QColumnMetadataFactory.create(config));
    }

    admin:
    {
      this.admin =
          this.<pl.exsio.querydsl.entityql.config.entity.it.GroupAdmin>createForeignKey(
              this.adminId, "NAME");
    }

    _primaryKey:
    {
      List<Path> paths = new ArrayList();

      paths.add(this.id);

      this._primaryKey =
          this.<pl.exsio.querydsl.entityql.config.entity.it.Group>createPrimaryKey(
              paths.<Path>toArray(new Path[0]));
    }
  }
}
