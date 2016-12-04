package com.mifos.objects.organisation;

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

public final class OfficeOpeningDate_Adapter extends ModelAdapter<OfficeOpeningDate> {
  public OfficeOpeningDate_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<OfficeOpeningDate> getModelClass() {
    return OfficeOpeningDate.class;
  }

  public final String getTableName() {
    return "`OfficeOpeningDate`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return OfficeOpeningDate_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, OfficeOpeningDate model) {
    values.put(OfficeOpeningDate_Table.officeId.getCursorKey(), model.officeId);
    values.put(OfficeOpeningDate_Table.year.getCursorKey(), model.year);
    values.put(OfficeOpeningDate_Table.month.getCursorKey(), model.month);
    values.put(OfficeOpeningDate_Table.day.getCursorKey(), model.day);
  }

  @Override
  public final void bindToContentValues(ContentValues values, OfficeOpeningDate model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, OfficeOpeningDate model, int start) {
    statement.bindLong(1 + start, model.officeId);
    statement.bindLong(2 + start, model.year);
    statement.bindLong(3 + start, model.month);
    statement.bindLong(4 + start, model.day);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, OfficeOpeningDate model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `OfficeOpeningDate`(`officeId`,`year`,`month`,`day`) VALUES (?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `OfficeOpeningDate`(`officeId`,`year`,`month`,`day`) VALUES (?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `OfficeOpeningDate`(`officeId` INTEGER,`year` INTEGER,`month` INTEGER,`day` INTEGER, PRIMARY KEY(`officeId`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, OfficeOpeningDate model) {
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      model.officeId = cursor.getInt(indexofficeId);
    } else {
      model.officeId = 0;
    }
    int indexyear = cursor.getColumnIndex("year");
    if (indexyear != -1 && !cursor.isNull(indexyear)) {
      model.year = cursor.getInt(indexyear);
    } else {
      model.year = 0;
    }
    int indexmonth = cursor.getColumnIndex("month");
    if (indexmonth != -1 && !cursor.isNull(indexmonth)) {
      model.month = cursor.getInt(indexmonth);
    } else {
      model.month = 0;
    }
    int indexday = cursor.getColumnIndex("day");
    if (indexday != -1 && !cursor.isNull(indexday)) {
      model.day = cursor.getInt(indexday);
    } else {
      model.day = 0;
    }
  }

  @Override
  public final boolean exists(OfficeOpeningDate model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(OfficeOpeningDate.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(OfficeOpeningDate model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(OfficeOpeningDate_Table.officeId.eq(model.officeId));return clause;
  }

  @Override
  public final OfficeOpeningDate newInstance() {
    return new OfficeOpeningDate();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return OfficeOpeningDate_Table.getProperty(name);
  }
}
