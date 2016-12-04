package com.mifos.objects.templates.loans;

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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class LoanRepaymentTemplate_Container extends ModelContainerAdapter<LoanRepaymentTemplate> {
  public LoanRepaymentTemplate_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("loanId", Integer.class);
    columnMap.put("amount", Double.class);
    columnMap.put("principalPortion", Double.class);
    columnMap.put("interestPortion", Double.class);
    columnMap.put("feeChargesPortion", Integer.class);
    columnMap.put("penaltyChargesPortion", Integer.class);
  }

  @Override
  public final Class<LoanRepaymentTemplate> getModelClass() {
    return LoanRepaymentTemplate.class;
  }

  public final String getTableName() {
    return "`LoanRepaymentTemplate`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<LoanRepaymentTemplate, ?> modelContainer) {
    Integer modelContainerloanId = modelContainer.getIntegerValue("loanId");
    if (modelContainerloanId != null) {
      values.put(LoanRepaymentTemplate_Table.loanId.getCursorKey(), modelContainerloanId);
    } else {
      values.putNull(LoanRepaymentTemplate_Table.loanId.getCursorKey());
    }
    Double modelContaineramount = modelContainer.getDoubleValue("amount");
    if (modelContaineramount != null) {
      values.put(LoanRepaymentTemplate_Table.amount.getCursorKey(), modelContaineramount);
    } else {
      values.putNull(LoanRepaymentTemplate_Table.amount.getCursorKey());
    }
    Double modelContainerprincipalPortion = modelContainer.getDoubleValue("principalPortion");
    if (modelContainerprincipalPortion != null) {
      values.put(LoanRepaymentTemplate_Table.principalPortion.getCursorKey(), modelContainerprincipalPortion);
    } else {
      values.putNull(LoanRepaymentTemplate_Table.principalPortion.getCursorKey());
    }
    Double modelContainerinterestPortion = modelContainer.getDoubleValue("interestPortion");
    if (modelContainerinterestPortion != null) {
      values.put(LoanRepaymentTemplate_Table.interestPortion.getCursorKey(), modelContainerinterestPortion);
    } else {
      values.putNull(LoanRepaymentTemplate_Table.interestPortion.getCursorKey());
    }
    Integer modelContainerfeeChargesPortion = modelContainer.getIntegerValue("feeChargesPortion");
    if (modelContainerfeeChargesPortion != null) {
      values.put(LoanRepaymentTemplate_Table.feeChargesPortion.getCursorKey(), modelContainerfeeChargesPortion);
    } else {
      values.putNull(LoanRepaymentTemplate_Table.feeChargesPortion.getCursorKey());
    }
    Integer modelContainerpenaltyChargesPortion = modelContainer.getIntegerValue("penaltyChargesPortion");
    if (modelContainerpenaltyChargesPortion != null) {
      values.put(LoanRepaymentTemplate_Table.penaltyChargesPortion.getCursorKey(), modelContainerpenaltyChargesPortion);
    } else {
      values.putNull(LoanRepaymentTemplate_Table.penaltyChargesPortion.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<LoanRepaymentTemplate, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<LoanRepaymentTemplate, ?> modelContainer, int start) {
    Integer modelContainerloanId = modelContainer.getIntegerValue("loanId");
    if (modelContainerloanId != null) {
      statement.bindLong(1 + start, modelContainerloanId);
    } else {
      statement.bindNull(1 + start);
    }
    Double modelContaineramount = modelContainer.getDoubleValue("amount");
    if (modelContaineramount != null) {
      statement.bindDouble(2 + start, modelContaineramount);
    } else {
      statement.bindNull(2 + start);
    }
    Double modelContainerprincipalPortion = modelContainer.getDoubleValue("principalPortion");
    if (modelContainerprincipalPortion != null) {
      statement.bindDouble(3 + start, modelContainerprincipalPortion);
    } else {
      statement.bindNull(3 + start);
    }
    Double modelContainerinterestPortion = modelContainer.getDoubleValue("interestPortion");
    if (modelContainerinterestPortion != null) {
      statement.bindDouble(4 + start, modelContainerinterestPortion);
    } else {
      statement.bindNull(4 + start);
    }
    Integer modelContainerfeeChargesPortion = modelContainer.getIntegerValue("feeChargesPortion");
    if (modelContainerfeeChargesPortion != null) {
      statement.bindLong(5 + start, modelContainerfeeChargesPortion);
    } else {
      statement.bindNull(5 + start);
    }
    Integer modelContainerpenaltyChargesPortion = modelContainer.getIntegerValue("penaltyChargesPortion");
    if (modelContainerpenaltyChargesPortion != null) {
      statement.bindLong(6 + start, modelContainerpenaltyChargesPortion);
    } else {
      statement.bindNull(6 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<LoanRepaymentTemplate, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<LoanRepaymentTemplate, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(LoanRepaymentTemplate.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<LoanRepaymentTemplate, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(LoanRepaymentTemplate_Table.loanId.eq(modelContainer.getIntegerValue("loanId")));return clause;
  }

  @Override
  public final LoanRepaymentTemplate toModel(ModelContainer<LoanRepaymentTemplate, ?> modelContainer) {
    LoanRepaymentTemplate model = new LoanRepaymentTemplate();
    model.loanId = modelContainer.getIntegerValue("loanId");
    model.amount = modelContainer.getDoubleValue("amount");
    model.principalPortion = modelContainer.getDoubleValue("principalPortion");
    model.interestPortion = modelContainer.getDoubleValue("interestPortion");
    model.feeChargesPortion = modelContainer.getIntegerValue("feeChargesPortion");
    model.penaltyChargesPortion = modelContainer.getIntegerValue("penaltyChargesPortion");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<LoanRepaymentTemplate, ?> modelContainer) {
    int indexloanId = cursor.getColumnIndex("loanId");
    if (indexloanId != -1 && !cursor.isNull(indexloanId)) {
      modelContainer.put("loanId", cursor.getInt(indexloanId));
    } else {
      modelContainer.putDefault("loanId");
    }
    int indexamount = cursor.getColumnIndex("amount");
    if (indexamount != -1 && !cursor.isNull(indexamount)) {
      modelContainer.put("amount", cursor.getDouble(indexamount));
    } else {
      modelContainer.putDefault("amount");
    }
    int indexprincipalPortion = cursor.getColumnIndex("principalPortion");
    if (indexprincipalPortion != -1 && !cursor.isNull(indexprincipalPortion)) {
      modelContainer.put("principalPortion", cursor.getDouble(indexprincipalPortion));
    } else {
      modelContainer.putDefault("principalPortion");
    }
    int indexinterestPortion = cursor.getColumnIndex("interestPortion");
    if (indexinterestPortion != -1 && !cursor.isNull(indexinterestPortion)) {
      modelContainer.put("interestPortion", cursor.getDouble(indexinterestPortion));
    } else {
      modelContainer.putDefault("interestPortion");
    }
    int indexfeeChargesPortion = cursor.getColumnIndex("feeChargesPortion");
    if (indexfeeChargesPortion != -1 && !cursor.isNull(indexfeeChargesPortion)) {
      modelContainer.put("feeChargesPortion", cursor.getInt(indexfeeChargesPortion));
    } else {
      modelContainer.putDefault("feeChargesPortion");
    }
    int indexpenaltyChargesPortion = cursor.getColumnIndex("penaltyChargesPortion");
    if (indexpenaltyChargesPortion != -1 && !cursor.isNull(indexpenaltyChargesPortion)) {
      modelContainer.put("penaltyChargesPortion", cursor.getInt(indexpenaltyChargesPortion));
    } else {
      modelContainer.putDefault("penaltyChargesPortion");
    }
  }

  @Override
  public final ForeignKeyContainer<LoanRepaymentTemplate> toForeignKeyContainer(LoanRepaymentTemplate model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(LoanRepaymentTemplate.class);
    modelContainer.put(LoanRepaymentTemplate_Table.loanId, model.loanId);
    return modelContainer;
  }
}
