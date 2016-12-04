package com.mifos.objects.organisation;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.language.Method;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.structure.container.ForeignKeyContainer;
import com.raizlabs.android.dbflow.structure.container.ModelContainer;
import com.raizlabs.android.dbflow.structure.container.ModelContainerAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class OfficeOpeningDate_Container extends ModelContainerAdapter<OfficeOpeningDate> {
  public OfficeOpeningDate_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("officeId", int.class);
    columnMap.put("year", int.class);
    columnMap.put("month", int.class);
    columnMap.put("day", int.class);
  }

  @Override
  public final Class<OfficeOpeningDate> getModelClass() {
    return OfficeOpeningDate.class;
  }

  public final String getTableName() {
    return "`OfficeOpeningDate`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<OfficeOpeningDate, ?> modelContainer) {
    values.put(OfficeOpeningDate_Table.officeId.getCursorKey(), modelContainer.getIntValue("officeId"));
    values.put(OfficeOpeningDate_Table.year.getCursorKey(), modelContainer.getIntValue("year"));
    values.put(OfficeOpeningDate_Table.month.getCursorKey(), modelContainer.getIntValue("month"));
    values.put(OfficeOpeningDate_Table.day.getCursorKey(), modelContainer.getIntValue("day"));
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<OfficeOpeningDate, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<OfficeOpeningDate, ?> modelContainer, int start) {
    statement.bindLong(1 + start, modelContainer.getIntValue("officeId"));
    statement.bindLong(2 + start, modelContainer.getIntValue("year"));
    statement.bindLong(3 + start, modelContainer.getIntValue("month"));
    statement.bindLong(4 + start, modelContainer.getIntValue("day"));
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<OfficeOpeningDate, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<OfficeOpeningDate, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(OfficeOpeningDate.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<OfficeOpeningDate, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(OfficeOpeningDate_Table.officeId.eq(modelContainer.getIntValue("officeId")));return clause;
  }

  @Override
  public final OfficeOpeningDate toModel(ModelContainer<OfficeOpeningDate, ?> modelContainer) {
    OfficeOpeningDate model = new OfficeOpeningDate();
    model.officeId = modelContainer.getIntValue("officeId");
    model.year = modelContainer.getIntValue("year");
    model.month = modelContainer.getIntValue("month");
    model.day = modelContainer.getIntValue("day");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<OfficeOpeningDate, ?> modelContainer) {
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      modelContainer.put("officeId", cursor.getInt(indexofficeId));
    } else {
      modelContainer.putDefault("officeId");
    }
    int indexyear = cursor.getColumnIndex("year");
    if (indexyear != -1 && !cursor.isNull(indexyear)) {
      modelContainer.put("year", cursor.getInt(indexyear));
    } else {
      modelContainer.putDefault("year");
    }
    int indexmonth = cursor.getColumnIndex("month");
    if (indexmonth != -1 && !cursor.isNull(indexmonth)) {
      modelContainer.put("month", cursor.getInt(indexmonth));
    } else {
      modelContainer.putDefault("month");
    }
    int indexday = cursor.getColumnIndex("day");
    if (indexday != -1 && !cursor.isNull(indexday)) {
      modelContainer.put("day", cursor.getInt(indexday));
    } else {
      modelContainer.putDefault("day");
    }
  }

  @Override
  public final ForeignKeyContainer<OfficeOpeningDate> toForeignKeyContainer(OfficeOpeningDate model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(OfficeOpeningDate.class);
    modelContainer.put(OfficeOpeningDate_Table.officeId, model.officeId);
    return modelContainer;
  }
}
