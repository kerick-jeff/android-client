package com.mifos.objects.accounts.loan;

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
public final class ActualDisbursementDate_Container extends ModelContainerAdapter<ActualDisbursementDate> {
  public ActualDisbursementDate_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("loanId", Integer.class);
    columnMap.put("year", Integer.class);
    columnMap.put("month", Integer.class);
    columnMap.put("date", Integer.class);
  }

  @Override
  public final Class<ActualDisbursementDate> getModelClass() {
    return ActualDisbursementDate.class;
  }

  public final String getTableName() {
    return "`ActualDisbursementDate`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<ActualDisbursementDate, ?> modelContainer) {
    Integer modelContainerloanId = modelContainer.getIntegerValue("loanId");
    if (modelContainerloanId != null) {
      values.put(ActualDisbursementDate_Table.loanId.getCursorKey(), modelContainerloanId);
    } else {
      values.putNull(ActualDisbursementDate_Table.loanId.getCursorKey());
    }
    Integer modelContaineryear = modelContainer.getIntegerValue("year");
    if (modelContaineryear != null) {
      values.put(ActualDisbursementDate_Table.year.getCursorKey(), modelContaineryear);
    } else {
      values.putNull(ActualDisbursementDate_Table.year.getCursorKey());
    }
    Integer modelContainermonth = modelContainer.getIntegerValue("month");
    if (modelContainermonth != null) {
      values.put(ActualDisbursementDate_Table.month.getCursorKey(), modelContainermonth);
    } else {
      values.putNull(ActualDisbursementDate_Table.month.getCursorKey());
    }
    Integer modelContainerdate = modelContainer.getIntegerValue("date");
    if (modelContainerdate != null) {
      values.put(ActualDisbursementDate_Table.date.getCursorKey(), modelContainerdate);
    } else {
      values.putNull(ActualDisbursementDate_Table.date.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<ActualDisbursementDate, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<ActualDisbursementDate, ?> modelContainer, int start) {
    Integer modelContainerloanId = modelContainer.getIntegerValue("loanId");
    if (modelContainerloanId != null) {
      statement.bindLong(1 + start, modelContainerloanId);
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
    Integer modelContainerdate = modelContainer.getIntegerValue("date");
    if (modelContainerdate != null) {
      statement.bindLong(4 + start, modelContainerdate);
    } else {
      statement.bindNull(4 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<ActualDisbursementDate, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<ActualDisbursementDate, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(ActualDisbursementDate.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<ActualDisbursementDate, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(ActualDisbursementDate_Table.loanId.eq(modelContainer.getIntegerValue("loanId")));return clause;
  }

  @Override
  public final ActualDisbursementDate toModel(ModelContainer<ActualDisbursementDate, ?> modelContainer) {
    ActualDisbursementDate model = new ActualDisbursementDate();
    model.loanId = modelContainer.getIntegerValue("loanId");
    model.year = modelContainer.getIntegerValue("year");
    model.month = modelContainer.getIntegerValue("month");
    model.date = modelContainer.getIntegerValue("date");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<ActualDisbursementDate, ?> modelContainer) {
    int indexloanId = cursor.getColumnIndex("loanId");
    if (indexloanId != -1 && !cursor.isNull(indexloanId)) {
      modelContainer.put("loanId", cursor.getInt(indexloanId));
    } else {
      modelContainer.putDefault("loanId");
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
    int indexdate = cursor.getColumnIndex("date");
    if (indexdate != -1 && !cursor.isNull(indexdate)) {
      modelContainer.put("date", cursor.getInt(indexdate));
    } else {
      modelContainer.putDefault("date");
    }
  }

  @Override
  public final ForeignKeyContainer<ActualDisbursementDate> toForeignKeyContainer(ActualDisbursementDate model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(ActualDisbursementDate.class);
    modelContainer.put(ActualDisbursementDate_Table.loanId, model.loanId);
    return modelContainer;
  }
}
