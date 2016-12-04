package com.mifos.objects.client;

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
public final class ClientDate_Container extends ModelContainerAdapter<ClientDate> {
  public ClientDate_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("clientId", long.class);
    columnMap.put("chargeId", long.class);
    columnMap.put("day", int.class);
    columnMap.put("month", int.class);
    columnMap.put("year", int.class);
  }

  @Override
  public final Class<ClientDate> getModelClass() {
    return ClientDate.class;
  }

  public final String getTableName() {
    return "`ClientDate`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<ClientDate, ?> modelContainer) {
    values.put(ClientDate_Table.clientId.getCursorKey(), modelContainer.getLngValue("clientId"));
    values.put(ClientDate_Table.chargeId.getCursorKey(), modelContainer.getLngValue("chargeId"));
    values.put(ClientDate_Table.day.getCursorKey(), modelContainer.getIntValue("day"));
    values.put(ClientDate_Table.month.getCursorKey(), modelContainer.getIntValue("month"));
    values.put(ClientDate_Table.year.getCursorKey(), modelContainer.getIntValue("year"));
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<ClientDate, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<ClientDate, ?> modelContainer, int start) {
    statement.bindLong(1 + start, modelContainer.getLngValue("clientId"));
    statement.bindLong(2 + start, modelContainer.getLngValue("chargeId"));
    statement.bindLong(3 + start, modelContainer.getIntValue("day"));
    statement.bindLong(4 + start, modelContainer.getIntValue("month"));
    statement.bindLong(5 + start, modelContainer.getIntValue("year"));
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<ClientDate, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<ClientDate, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(ClientDate.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<ClientDate, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(ClientDate_Table.clientId.eq(modelContainer.getLngValue("clientId")));
    clause.and(ClientDate_Table.chargeId.eq(modelContainer.getLngValue("chargeId")));return clause;
  }

  @Override
  public final ClientDate toModel(ModelContainer<ClientDate, ?> modelContainer) {
    ClientDate model = new ClientDate();
    model.clientId = modelContainer.getLngValue("clientId");
    model.chargeId = modelContainer.getLngValue("chargeId");
    model.day = modelContainer.getIntValue("day");
    model.month = modelContainer.getIntValue("month");
    model.year = modelContainer.getIntValue("year");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<ClientDate, ?> modelContainer) {
    int indexclientId = cursor.getColumnIndex("clientId");
    if (indexclientId != -1 && !cursor.isNull(indexclientId)) {
      modelContainer.put("clientId", cursor.getLong(indexclientId));
    } else {
      modelContainer.putDefault("clientId");
    }
    int indexchargeId = cursor.getColumnIndex("chargeId");
    if (indexchargeId != -1 && !cursor.isNull(indexchargeId)) {
      modelContainer.put("chargeId", cursor.getLong(indexchargeId));
    } else {
      modelContainer.putDefault("chargeId");
    }
    int indexday = cursor.getColumnIndex("day");
    if (indexday != -1 && !cursor.isNull(indexday)) {
      modelContainer.put("day", cursor.getInt(indexday));
    } else {
      modelContainer.putDefault("day");
    }
    int indexmonth = cursor.getColumnIndex("month");
    if (indexmonth != -1 && !cursor.isNull(indexmonth)) {
      modelContainer.put("month", cursor.getInt(indexmonth));
    } else {
      modelContainer.putDefault("month");
    }
    int indexyear = cursor.getColumnIndex("year");
    if (indexyear != -1 && !cursor.isNull(indexyear)) {
      modelContainer.put("year", cursor.getInt(indexyear));
    } else {
      modelContainer.putDefault("year");
    }
  }

  @Override
  public final ForeignKeyContainer<ClientDate> toForeignKeyContainer(ClientDate model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(ClientDate.class);
    modelContainer.put(ClientDate_Table.clientId, model.clientId);
    modelContainer.put(ClientDate_Table.chargeId, model.chargeId);
    return modelContainer;
  }
}