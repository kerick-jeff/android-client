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

public final class InterestType_Adapter extends ModelAdapter<InterestType> {
  public InterestType_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<InterestType> getModelClass() {
    return InterestType.class;
  }

  public final String getTableName() {
    return "`ClientTemplateInterest`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return InterestType_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, InterestType model) {
    if (model.id != null) {
      values.put(InterestType_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(InterestType_Table.id.getCursorKey());
    }
    if (model.code != null) {
      values.put(InterestType_Table.code.getCursorKey(), model.code);
    } else {
      values.putNull(InterestType_Table.code.getCursorKey());
    }
    if (model.value != null) {
      values.put(InterestType_Table.value.getCursorKey(), model.value);
    } else {
      values.putNull(InterestType_Table.value.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, InterestType model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, InterestType model, int start) {
    if (model.id != null) {
      statement.bindLong(1 + start, model.id);
    } else {
      statement.bindNull(1 + start);
    }
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
  public final void bindToStatement(DatabaseStatement statement, InterestType model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `ClientTemplateInterest`(`id`,`code`,`value`) VALUES (?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `ClientTemplateInterest`(`id`,`code`,`value`) VALUES (?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `ClientTemplateInterest`(`id` INTEGER,`code` TEXT,`value` TEXT, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, InterestType model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = null;
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
  public final boolean exists(InterestType model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(InterestType.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(InterestType model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(InterestType_Table.id.eq(model.id));return clause;
  }

  @Override
  public final InterestType newInstance() {
    return new InterestType();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return InterestType_Table.getProperty(name);
  }
}
