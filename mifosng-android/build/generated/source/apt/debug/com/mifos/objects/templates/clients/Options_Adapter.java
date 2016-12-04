package com.mifos.objects.templates.clients;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.language.Method;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

public final class Options_Adapter extends ModelAdapter<Options> {
  public Options_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Options> getModelClass() {
    return Options.class;
  }

  public final String getTableName() {
    return "`ClientTemplateOptions`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Options_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Options model) {
    if (model.genderOptions != null) {
      values.put(Options_Table.genderOptions.getCursorKey(), model.genderOptions);
    } else {
      values.putNull(Options_Table.genderOptions.getCursorKey());
    }
    if (model.clientTypeOptions != null) {
      values.put(Options_Table.clientTypeOptions.getCursorKey(), model.clientTypeOptions);
    } else {
      values.putNull(Options_Table.clientTypeOptions.getCursorKey());
    }
    if (model.clientClassificationOptions != null) {
      values.put(Options_Table.clientClassificationOptions.getCursorKey(), model.clientClassificationOptions);
    } else {
      values.putNull(Options_Table.clientClassificationOptions.getCursorKey());
    }
    values.put(Options_Table.id.getCursorKey(), model.id);
    if (model.name != null) {
      values.put(Options_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(Options_Table.name.getCursorKey());
    }
    values.put(Options_Table.position.getCursorKey(), model.position);
    if (model.description != null) {
      values.put(Options_Table.description.getCursorKey(), model.description);
    } else {
      values.putNull(Options_Table.description.getCursorKey());
    }
    values.put(Options_Table.activeStatus.getCursorKey(), model.activeStatus ? 1 : 0);
  }

  @Override
  public final void bindToContentValues(ContentValues values, Options model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Options model, int start) {
    if (model.genderOptions != null) {
      statement.bindString(1 + start, model.genderOptions);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.clientTypeOptions != null) {
      statement.bindString(2 + start, model.clientTypeOptions);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.clientClassificationOptions != null) {
      statement.bindString(3 + start, model.clientClassificationOptions);
    } else {
      statement.bindNull(3 + start);
    }
    statement.bindLong(4 + start, model.id);
    if (model.name != null) {
      statement.bindString(5 + start, model.name);
    } else {
      statement.bindNull(5 + start);
    }
    statement.bindLong(6 + start, model.position);
    if (model.description != null) {
      statement.bindString(7 + start, model.description);
    } else {
      statement.bindNull(7 + start);
    }
    statement.bindLong(8 + start, model.activeStatus ? 1 : 0);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Options model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `ClientTemplateOptions`(`genderOptions`,`clientTypeOptions`,`clientClassificationOptions`,`id`,`name`,`position`,`description`,`activeStatus`) VALUES (?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `ClientTemplateOptions`(`genderOptions`,`clientTypeOptions`,`clientClassificationOptions`,`id`,`name`,`position`,`description`,`activeStatus`) VALUES (?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `ClientTemplateOptions`(`genderOptions` TEXT,`clientTypeOptions` TEXT,`clientClassificationOptions` TEXT,`id` INTEGER,`name` TEXT,`position` INTEGER,`description` TEXT,`activeStatus` INTEGER, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Options model) {
    int indexgenderOptions = cursor.getColumnIndex("genderOptions");
    if (indexgenderOptions != -1 && !cursor.isNull(indexgenderOptions)) {
      model.genderOptions = cursor.getString(indexgenderOptions);
    } else {
      model.genderOptions = null;
    }
    int indexclientTypeOptions = cursor.getColumnIndex("clientTypeOptions");
    if (indexclientTypeOptions != -1 && !cursor.isNull(indexclientTypeOptions)) {
      model.clientTypeOptions = cursor.getString(indexclientTypeOptions);
    } else {
      model.clientTypeOptions = null;
    }
    int indexclientClassificationOptions = cursor.getColumnIndex("clientClassificationOptions");
    if (indexclientClassificationOptions != -1 && !cursor.isNull(indexclientClassificationOptions)) {
      model.clientClassificationOptions = cursor.getString(indexclientClassificationOptions);
    } else {
      model.clientClassificationOptions = null;
    }
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = 0;
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      model.name = cursor.getString(indexname);
    } else {
      model.name = null;
    }
    int indexposition = cursor.getColumnIndex("position");
    if (indexposition != -1 && !cursor.isNull(indexposition)) {
      model.position = cursor.getInt(indexposition);
    } else {
      model.position = 0;
    }
    int indexdescription = cursor.getColumnIndex("description");
    if (indexdescription != -1 && !cursor.isNull(indexdescription)) {
      model.description = cursor.getString(indexdescription);
    } else {
      model.description = null;
    }
    int indexactiveStatus = cursor.getColumnIndex("activeStatus");
    if (indexactiveStatus != -1 && !cursor.isNull(indexactiveStatus)) {
      model.activeStatus = cursor.getInt(indexactiveStatus) == 1 ? true : false;
    } else {
      model.activeStatus = false;
    }
  }

  @Override
  public final boolean exists(Options model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Options.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Options model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Options_Table.id.eq(model.id));return clause;
  }

  @Override
  public final Options newInstance() {
    return new Options();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Options_Table.getProperty(name);
  }
}
