package com.mifos.objects.client;

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

public final class Status_Adapter extends ModelAdapter<Status> {
  public Status_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Status> getModelClass() {
    return Status.class;
  }

  public final String getTableName() {
    return "`Status`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Status_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Status model) {
    values.put(Status_Table.id.getCursorKey(), model.id);
    if (model.code != null) {
      values.put(Status_Table.code.getCursorKey(), model.code);
    } else {
      values.putNull(Status_Table.code.getCursorKey());
    }
    if (model.value != null) {
      values.put(Status_Table.value.getCursorKey(), model.value);
    } else {
      values.putNull(Status_Table.value.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Status model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Status model, int start) {
    statement.bindLong(1 + start, model.id);
    if (model.code != null) {
      statement.bindString(2 + start, model.code);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.value != null) {
      statement.bindString(3 + start, model.value);
    } else {
      statement.bindNull(3 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Status model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Status`(`id`,`code`,`value`) VALUES (?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Status`(`id`,`code`,`value`) VALUES (?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Status`(`id` INTEGER,`code` TEXT,`value` TEXT, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Status model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = 0;
    }
    int indexcode = cursor.getColumnIndex("code");
    if (indexcode != -1 && !cursor.isNull(indexcode)) {
      model.code = cursor.getString(indexcode);
    } else {
      model.code = null;
    }
    int indexvalue = cursor.getColumnIndex("value");
    if (indexvalue != -1 && !cursor.isNull(indexvalue)) {
      model.value = cursor.getString(indexvalue);
    } else {
      model.value = null;
    }
  }

  @Override
  public final boolean exists(Status model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Status.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Status model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Status_Table.id.eq(model.id));return clause;
  }

  @Override
  public final Status newInstance() {
    return new Status();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Status_Table.getProperty(name);
  }
}
