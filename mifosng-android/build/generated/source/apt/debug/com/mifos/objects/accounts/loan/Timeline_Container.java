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
public final class Timeline_Container extends ModelContainerAdapter<Timeline> {
  public Timeline_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("loanId", Integer.class);
    columnMap.put("actualDisburseDate", ActualDisbursementDate.class);
  }

  @Override
  public final Class<Timeline> getModelClass() {
    return Timeline.class;
  }

  public final String getTableName() {
    return "`Timeline`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Timeline, ?> modelContainer) {
    Integer modelContainerloanId = modelContainer.getIntegerValue("loanId");
    if (modelContainerloanId != null) {
      values.put(Timeline_Table.loanId.getCursorKey(), modelContainerloanId);
    } else {
      values.putNull(Timeline_Table.loanId.getCursorKey());
    }
    ModelContainer<ActualDisbursementDate, ?> refactualDisburseDate = modelContainer.getInstance(modelContainer.getValue("actualDisburseDate"), com.mifos.objects.accounts.loan.ActualDisbursementDate.class);
    if (refactualDisburseDate != null) {
      refactualDisburseDate.save();
      Integer refactualDisburseDateloanId = refactualDisburseDate.getIntegerValue("loanId");
      if (refactualDisburseDateloanId != null) {
        values.put(Timeline_Table.actualDisburseDate_loanId.getCursorKey(), refactualDisburseDateloanId);
      } else {
        values.putNull(Timeline_Table.actualDisburseDate_loanId.getCursorKey());
      }
    } else {
      values.putNull("`actualDisburseDate_loanId`");
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Timeline, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Timeline, ?> modelContainer, int start) {
    Integer modelContainerloanId = modelContainer.getIntegerValue("loanId");
    if (modelContainerloanId != null) {
      statement.bindLong(1 + start, modelContainerloanId);
    } else {
      statement.bindNull(1 + start);
    }
    ModelContainer<ActualDisbursementDate, ?> refactualDisburseDate = modelContainer.getInstance(modelContainer.getValue("actualDisburseDate"), com.mifos.objects.accounts.loan.ActualDisbursementDate.class);
    if (refactualDisburseDate != null) {
      refactualDisburseDate.save();
      Integer refactualDisburseDateloanId = refactualDisburseDate.getIntegerValue("loanId");
      if (refactualDisburseDateloanId != null) {
        statement.bindLong(2 + start, refactualDisburseDateloanId);
      } else {
        statement.bindNull(2 + start);
      }
    } else {
      statement.bindNull(2 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Timeline, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Timeline, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Timeline.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Timeline, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Timeline_Table.loanId.eq(modelContainer.getIntegerValue("loanId")));return clause;
  }

  @Override
  public final Timeline toModel(ModelContainer<Timeline, ?> modelContainer) {
    Timeline model = new Timeline();
    model.loanId = modelContainer.getIntegerValue("loanId");
    ModelContainer<ActualDisbursementDate, ?> refactualDisburseDate = modelContainer.getInstance(modelContainer.getValue("actualDisburseDate"), com.mifos.objects.accounts.loan.ActualDisbursementDate.class);
    if (refactualDisburseDate != null) {
      model.actualDisburseDate = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.loan.ActualDisbursementDate.class).toModel(refactualDisburseDate);
    }
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Timeline, ?> modelContainer) {
    int indexloanId = cursor.getColumnIndex("loanId");
    if (indexloanId != -1 && !cursor.isNull(indexloanId)) {
      modelContainer.put("loanId", cursor.getInt(indexloanId));
    } else {
      modelContainer.putDefault("loanId");
    }
    //// Only load model if references match, for efficiency
    int indexactualDisburseDate_loanId = cursor.getColumnIndex("actualDisburseDate_loanId");
    if (indexactualDisburseDate_loanId != -1 && !cursor.isNull(indexactualDisburseDate_loanId)) {
      modelContainer.put("actualDisburseDate", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.loan.ActualDisbursementDate.class).where()
          .and(com.mifos.objects.accounts.loan.ActualDisbursementDate_Table.loanId.eq(cursor.getInt(indexactualDisburseDate_loanId))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.loan.ActualDisbursementDate.class)).getData());
    } else {
      modelContainer.putDefault("actualDisburseDate");
    }
  }

  @Override
  public final ForeignKeyContainer<Timeline> toForeignKeyContainer(Timeline model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Timeline.class);
    modelContainer.put(Timeline_Table.loanId, model.loanId);
    return modelContainer;
  }
}
