package com.mifos.objects.accounts.savings;

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
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class SavingsTransactionDate_Container extends ModelContainerAdapter<SavingsTransactionDate> {
  public SavingsTransactionDate_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("transactionId", Integer.class);
    columnMap.put("year", Integer.class);
    columnMap.put("month", Integer.class);
    columnMap.put("day", Integer.class);
  }

  @Override
  public final Class<SavingsTransactionDate> getModelClass() {
    return SavingsTransactionDate.class;
  }

  public final String getTableName() {
    return "`SavingsTransactionDate`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<SavingsTransactionDate, ?> modelContainer) {
    Integer modelContainertransactionId = modelContainer.getIntegerValue("transactionId");
    if (modelContainertransactionId != null) {
      values.put(SavingsTransactionDate_Table.transactionId.getCursorKey(), modelContainertransactionId);
    } else {
      values.putNull(SavingsTransactionDate_Table.transactionId.getCursorKey());
    }
    Integer modelContaineryear = modelContainer.getIntegerValue("year");
    if (modelContaineryear != null) {
      values.put(SavingsTransactionDate_Table.year.getCursorKey(), modelContaineryear);
    } else {
      values.putNull(SavingsTransactionDate_Table.year.getCursorKey());
    }
    Integer modelContainermonth = modelContainer.getIntegerValue("month");
    if (modelContainermonth != null) {
      values.put(SavingsTransactionDate_Table.month.getCursorKey(), modelContainermonth);
    } else {
      values.putNull(SavingsTransactionDate_Table.month.getCursorKey());
    }
    Integer modelContainerday = modelContainer.getIntegerValue("day");
    if (modelContainerday != null) {
      values.put(SavingsTransactionDate_Table.day.getCursorKey(), modelContainerday);
    } else {
      values.putNull(SavingsTransactionDate_Table.day.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<SavingsTransactionDate, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<SavingsTransactionDate, ?> modelContainer, int start) {
    Integer modelContainertransactionId = modelContainer.getIntegerValue("transactionId");
    if (modelContainertransactionId != null) {
      statement.bindLong(1 + start, modelContainertransactionId);
    } else {
      statement.bindNull(1 + start);
    }
    Integer modelContaineryear = modelContainer.getIntegerValue("year");
    if (modelContaineryear != null) {
      statement.bindLong(2 + start, modelContaineryear);
    } else {
      statement.bindNull(2 + start);
    }
    Integer modelContainermonth = modelContainer.getIntegerValue("month");
    if (modelContainermonth != null) {
      statement.bindLong(3 + start, modelContainermonth);
    } else {
      statement.bindNull(3 + start);
    }
    Integer modelContainerday = modelContainer.getIntegerValue("day");
    if (modelContainerday != null) {
      statement.bindLong(4 + start, modelContainerday);
    } else {
      statement.bindNull(4 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<SavingsTransactionDate, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<SavingsTransactionDate, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(SavingsTransactionDate.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<SavingsTransactionDate, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(SavingsTransactionDate_Table.transactionId.eq(modelContainer.getIntegerValue("transactionId")));return clause;
  }

  @Override
  public final SavingsTransactionDate toModel(ModelContainer<SavingsTransactionDate, ?> modelContainer) {
    SavingsTransactionDate model = new SavingsTransactionDate();
    model.transactionId = modelContainer.getIntegerValue("transactionId");
    model.year = modelContainer.getIntegerValue("year");
    model.month = modelContainer.getIntegerValue("month");
    model.day = modelContainer.getIntegerValue("day");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<SavingsTransactionDate, ?> modelContainer) {
    int indextransactionId = cursor.getColumnIndex("transactionId");
    if (indextransactionId != -1 && !cursor.isNull(indextransactionId)) {
      modelContainer.put("transactionId", cursor.getInt(indextransactionId));
    } else {
      modelContainer.putDefault("transactionId");
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
  public final ForeignKeyContainer<SavingsTransactionDate> toForeignKeyContainer(SavingsTransactionDate model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(SavingsTransactionDate.class);
    modelContainer.put(SavingsTransactionDate_Table.transactionId, model.transactionId);
    return modelContainer;
  }
}
