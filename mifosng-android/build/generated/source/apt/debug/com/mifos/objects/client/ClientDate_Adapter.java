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

public final class ClientDate_Adapter extends ModelAdapter<ClientDate> {
  public ClientDate_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<ClientDate> getModelClass() {
    return ClientDate.class;
  }

  public final String getTableName() {
    return "`ClientDate`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ClientDate_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ClientDate model) {
    values.put(ClientDate_Table.clientId.getCursorKey(), model.clientId);
    values.put(ClientDate_Table.chargeId.getCursorKey(), model.chargeId);
    values.put(ClientDate_Table.day.getCursorKey(), model.day);
    values.put(ClientDate_Table.month.getCursorKey(), model.month);
    values.put(ClientDate_Table.year.getCursorKey(), model.year);
  }

  @Override
  public final void bindToContentValues(ContentValues values, ClientDate model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ClientDate model, int start) {
    statement.bindLong(1 + start, model.clientId);
    statement.bindLong(2 + start, model.chargeId);
    statement.bindLong(3 + start, model.day);
    statement.bindLong(4 + start, model.month);
    statement.bindLong(5 + start, model.year);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ClientDate model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `ClientDate`(`clientId`,`chargeId`,`day`,`month`,`year`) VALUES (?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `ClientDate`(`clientId`,`chargeId`,`day`,`month`,`year`) VALUES (?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `ClientDate`(`clientId` INTEGER,`chargeId` INTEGER,`day` INTEGER,`month` INTEGER,`year` INTEGER, PRIMARY KEY(`clientId`,`chargeId`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ClientDate model) {
    int indexclientId = cursor.getColumnIndex("clientId");
    if (indexclientId != -1 && !cursor.isNull(indexclientId)) {
      model.clientId = cursor.getLong(indexclientId);
    } else {
      model.clientId = 0;
    }
    int indexchargeId = cursor.getColumnIndex("chargeId");
    if (indexchargeId != -1 && !cursor.isNull(indexchargeId)) {
      model.chargeId = cursor.getLong(indexchargeId);
    } else {
      model.chargeId = 0;
    }
    int indexday = cursor.getColumnIndex("day");
    if (indexday != -1 && !cursor.isNull(indexday)) {
      model.day = cursor.getInt(indexday);
    } else {
      model.day = 0;
    }
    int indexmonth = cursor.getColumnIndex("month");
    if (indexmonth != -1 && !cursor.isNull(indexmonth)) {
      model.month = cursor.getInt(indexmonth);
    } else {
      model.month = 0;
    }
    int indexyear = cursor.getColumnIndex("year");
    if (indexyear != -1 && !cursor.isNull(indexyear)) {
      model.year = cursor.getInt(indexyear);
    } else {
      model.year = 0;
    }
  }

  @Override
  public final boolean exists(ClientDate model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(ClientDate.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ClientDate model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(ClientDate_Table.clientId.eq(model.clientId));
    clause.and(ClientDate_Table.chargeId.eq(model.chargeId));return clause;
  }

  @Override
  public final ClientDate newInstance() {
    return new ClientDate();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return ClientDate_Table.getProperty(name);
  }
}
