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

public final class OfficeOptions_Adapter extends ModelAdapter<OfficeOptions> {
  public OfficeOptions_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<OfficeOptions> getModelClass() {
    return OfficeOptions.class;
  }

  public final String getTableName() {
    return "`ClientTemplateOfficeOptions`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return OfficeOptions_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, OfficeOptions model) {
    values.put(OfficeOptions_Table.id.getCursorKey(), model.id);
    if (model.name != null) {
      values.put(OfficeOptions_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(OfficeOptions_Table.name.getCursorKey());
    }
    if (model.nameDecorated != null) {
      values.put(OfficeOptions_Table.nameDecorated.getCursorKey(), model.nameDecorated);
    } else {
      values.putNull(OfficeOptions_Table.nameDecorated.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, OfficeOptions model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, OfficeOptions model, int start) {
    statement.bindLong(1 + start, model.id);
    if (model.name != null) {
      statement.bindString(2 + start, model.name);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.nameDecorated != null) {
      statement.bindString(3 + start, model.nameDecorated);
    } else {
      statement.bindNull(3 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, OfficeOptions model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `ClientTemplateOfficeOptions`(`id`,`name`,`nameDecorated`) VALUES (?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `ClientTemplateOfficeOptions`(`id`,`name`,`nameDecorated`) VALUES (?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `ClientTemplateOfficeOptions`(`id` INTEGER,`name` TEXT,`nameDecorated` TEXT, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, OfficeOptions model) {
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
    int indexnameDecorated = cursor.getColumnIndex("nameDecorated");
    if (indexnameDecorated != -1 && !cursor.isNull(indexnameDecorated)) {
      model.nameDecorated = cursor.getString(indexnameDecorated);
    } else {
      model.nameDecorated = null;
    }
  }

  @Override
  public final boolean exists(OfficeOptions model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(OfficeOptions.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(OfficeOptions model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(OfficeOptions_Table.id.eq(model.id));return clause;
  }

  @Override
  public final OfficeOptions newInstance() {
    return new OfficeOptions();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return OfficeOptions_Table.getProperty(name);
  }
}
