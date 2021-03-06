package pl.exsio.querydsl.entityql.jpa.entity.generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.PrimaryKey;
import java.util.Arrays;
import javax.annotation.Generated;
import pl.exsio.querydsl.entityql.QColumnMetadataFactory;
import pl.exsio.querydsl.entityql.QPathConfig;
import pl.exsio.querydsl.entityql.QPathFactory;
import pl.exsio.querydsl.entityql.QStaticModel;
import pl.exsio.querydsl.entityql.jpa.entity.JGroupAdmin;

/**
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
@Generated("pl.exsio.querydsl.entityql.QExporter")
public final class QJGroupAdmin extends QStaticModel<JGroupAdmin> {

  private static final long serialVersionUID = -1049580923;

  public static final QJGroupAdmin INSTANCE = new QJGroupAdmin();

  public static final QJGroupAdmin qJGroupAdmin = INSTANCE;

  public final NumberPath<Long> id;

  public final StringPath name;

  public final PrimaryKey<JGroupAdmin> _primaryKey;

  public QJGroupAdmin() {
    this("JGROUP_ADMINS");
  }

  @SuppressWarnings(value = "unchecked")
  public QJGroupAdmin(String variable) {
    super(JGroupAdmin.class, variable, "", "JGROUP_ADMINS");

    id:
    {
      QPathConfig config = new QPathConfig(Long.class, Long.class, "GA_ID", true, 1, -5);

      this.id = QPathFactory.<NumberPath<Long>>create(this, config);

      addMetadata(this.id, QColumnMetadataFactory.create(config));
      this.columnsMap.put("id", this.id);
    }

    name:
    {
      QPathConfig config = new QPathConfig(String.class, String.class, "NAME", true, 2, 12);

      this.name = QPathFactory.<StringPath>create(this, config);

      addMetadata(this.name, QColumnMetadataFactory.create(config));
      this.columnsMap.put("name", this.name);
    }

    _primaryKey:
    {
      this.primaryKeyColumns = Arrays.<Path<?>>asList(this.id);

      this._primaryKey =
          this.<JGroupAdmin>createPrimaryKey(primaryKeyColumns.<Path>toArray(new Path[0]));
    }
  }
}
