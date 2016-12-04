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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Summary_Container extends ModelContainerAdapter<Summary> {
  public Summary_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("loanId", Integer.class);
    columnMap.put("principalDisbursed", Integer.class);
    columnMap.put("principalPaid", Double.class);
    columnMap.put("principalOutstanding", Double.class);
    columnMap.put("interestCharged", Double.class);
    columnMap.put("interestPaid", Double.class);
    columnMap.put("interestOutstanding", Double.class);
    columnMap.put("feeChargesCharged", Double.class);
    columnMap.put("feeChargesPaid", Double.class);
    columnMap.put("feeChargesOutstanding", Integer.class);
    columnMap.put("penaltyChargesCharged", Integer.class);
    columnMap.put("penaltyChargesPaid", Integer.class);
    columnMap.put("penaltyChargesOutstanding", Integer.class);
    columnMap.put("totalExpectedRepayment", Double.class);
    columnMap.put("totalRepayment", Double.class);
    columnMap.put("totalOutstanding", Double.class);
    columnMap.put("totalOverdue", Double.class);
  }

  @Override
  public final Class<Summary> getModelClass() {
    return Summary.class;
  }

  public final String getTableName() {
    return "`LoansAccountSummary`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Summary, ?> modelContainer) {
    Integer modelContainerloanId = modelContainer.getIntegerValue("loanId");
    if (modelContainerloanId != null) {
      values.put(Summary_Table.loanId.getCursorKey(), modelContainerloanId);
    } else {
      values.putNull(Summary_Table.loanId.getCursorKey());
    }
    Integer modelContainerprincipalDisbursed = modelContainer.getIntegerValue("principalDisbursed");
    if (modelContainerprincipalDisbursed != null) {
      values.put(Summary_Table.principalDisbursed.getCursorKey(), modelContainerprincipalDisbursed);
    } else {
      values.putNull(Summary_Table.principalDisbursed.getCursorKey());
    }
    Double modelContainerprincipalPaid = modelContainer.getDoubleValue("principalPaid");
    if (modelContainerprincipalPaid != null) {
      values.put(Summary_Table.principalPaid.getCursorKey(), modelContainerprincipalPaid);
    } else {
      values.putNull(Summary_Table.principalPaid.getCursorKey());
    }
    Double modelContainerprincipalOutstanding = modelContainer.getDoubleValue("principalOutstanding");
    if (modelContainerprincipalOutstanding != null) {
      values.put(Summary_Table.principalOutstanding.getCursorKey(), modelContainerprincipalOutstanding);
    } else {
      values.putNull(Summary_Table.principalOutstanding.getCursorKey());
    }
    Double modelContainerinterestCharged = modelContainer.getDoubleValue("interestCharged");
    if (modelContainerinterestCharged != null) {
      values.put(Summary_Table.interestCharged.getCursorKey(), modelContainerinterestCharged);
    } else {
      values.putNull(Summary_Table.interestCharged.getCursorKey());
    }
    Double modelContainerinterestPaid = modelContainer.getDoubleValue("interestPaid");
    if (modelContainerinterestPaid != null) {
      values.put(Summary_Table.interestPaid.getCursorKey(), modelContainerinterestPaid);
    } else {
      values.putNull(Summary_Table.interestPaid.getCursorKey());
    }
    Double modelContainerinterestOutstanding = modelContainer.getDoubleValue("interestOutstanding");
    if (modelContainerinterestOutstanding != null) {
      values.put(Summary_Table.interestOutstanding.getCursorKey(), modelContainerinterestOutstanding);
    } else {
      values.putNull(Summary_Table.interestOutstanding.getCursorKey());
    }
    Double modelContainerfeeChargesCharged = modelContainer.getDoubleValue("feeChargesCharged");
    if (modelContainerfeeChargesCharged != null) {
      values.put(Summary_Table.feeChargesCharged.getCursorKey(), modelContainerfeeChargesCharged);
    } else {
      values.putNull(Summary_Table.feeChargesCharged.getCursorKey());
    }
    Double modelContainerfeeChargesPaid = modelContainer.getDoubleValue("feeChargesPaid");
    if (modelContainerfeeChargesPaid != null) {
      values.put(Summary_Table.feeChargesPaid.getCursorKey(), modelContainerfeeChargesPaid);
    } else {
      values.putNull(Summary_Table.feeChargesPaid.getCursorKey());
    }
    Integer modelContainerfeeChargesOutstanding = modelContainer.getIntegerValue("feeChargesOutstanding");
    if (modelContainerfeeChargesOutstanding != null) {
      values.put(Summary_Table.feeChargesOutstanding.getCursorKey(), modelContainerfeeChargesOutstanding);
    } else {
      values.putNull(Summary_Table.feeChargesOutstanding.getCursorKey());
    }
    Integer modelContainerpenaltyChargesCharged = modelContainer.getIntegerValue("penaltyChargesCharged");
    if (modelContainerpenaltyChargesCharged != null) {
      values.put(Summary_Table.penaltyChargesCharged.getCursorKey(), modelContainerpenaltyChargesCharged);
    } else {
      values.putNull(Summary_Table.penaltyChargesCharged.getCursorKey());
    }
    Integer modelContainerpenaltyChargesPaid = modelContainer.getIntegerValue("penaltyChargesPaid");
    if (modelContainerpenaltyChargesPaid != null) {
      values.put(Summary_Table.penaltyChargesPaid.getCursorKey(), modelContainerpenaltyChargesPaid);
    } else {
      values.putNull(Summary_Table.penaltyChargesPaid.getCursorKey());
    }
    Integer modelContainerpenaltyChargesOutstanding = modelContainer.getIntegerValue("penaltyChargesOutstanding");
    if (modelContainerpenaltyChargesOutstanding != null) {
      values.put(Summary_Table.penaltyChargesOutstanding.getCursorKey(), modelContainerpenaltyChargesOutstanding);
    } else {
      values.putNull(Summary_Table.penaltyChargesOutstanding.getCursorKey());
    }
    Double modelContainertotalExpectedRepayment = modelContainer.getDoubleValue("totalExpectedRepayment");
    if (modelContainertotalExpectedRepayment != null) {
      values.put(Summary_Table.totalExpectedRepayment.getCursorKey(), modelContainertotalExpectedRepayment);
    } else {
      values.putNull(Summary_Table.totalExpectedRepayment.getCursorKey());
    }
    Double modelContainertotalRepayment = modelContainer.getDoubleValue("totalRepayment");
    if (modelContainertotalRepayment != null) {
      values.put(Summary_Table.totalRepayment.getCursorKey(), modelContainertotalRepayment);
    } else {
      values.putNull(Summary_Table.totalRepayment.getCursorKey());
    }
    Double modelContainertotalOutstanding = modelContainer.getDoubleValue("totalOutstanding");
    if (modelContainertotalOutstanding != null) {
      values.put(Summary_Table.totalOutstanding.getCursorKey(), modelContainertotalOutstanding);
    } else {
      values.putNull(Summary_Table.totalOutstanding.getCursorKey());
    }
    Double modelContainertotalOverdue = modelContainer.getDoubleValue("totalOverdue");
    if (modelContainertotalOverdue != null) {
      values.put(Summary_Table.totalOverdue.getCursorKey(), modelContainertotalOverdue);
    } else {
      values.putNull(Summary_Table.totalOverdue.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Summary, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Summary, ?> modelContainer, int start) {
    Integer modelContainerloanId = modelContainer.getIntegerValue("loanId");
    if (modelContainerloanId != null) {
      statement.bindLong(1 + start, modelContainerloanId);
    } else {
      statement.bindNull(1 + start);
    }
    Integer modelContainerprincipalDisbursed = modelContainer.getIntegerValue("principalDisbursed");
    if (modelContainerprincipalDisbursed != null) {
      statement.bindLong(2 + start, modelContainerprincipalDisbursed);
    } else {
      statement.bindNull(2 + start);
    }
    Double modelContainerprincipalPaid = modelContainer.getDoubleValue("principalPaid");
    if (modelContainerprincipalPaid != null) {
      statement.bindDouble(3 + start, modelContainerprincipalPaid);
    } else {
      statement.bindNull(3 + start);
    }
    Double modelContainerprincipalOutstanding = modelContainer.getDoubleValue("principalOutstanding");
    if (modelContainerprincipalOutstanding != null) {
      statement.bindDouble(4 + start, modelContainerprincipalOutstanding);
    } else {
      statement.bindNull(4 + start);
    }
    Double modelContainerinterestCharged = modelContainer.getDoubleValue("interestCharged");
    if (modelContainerinterestCharged != null) {
      statement.bindDouble(5 + start, modelContainerinterestCharged);
    } else {
      statement.bindNull(5 + start);
    }
    Double modelContainerinterestPaid = modelContainer.getDoubleValue("interestPaid");
    if (modelContainerinterestPaid != null) {
      statement.bindDouble(6 + start, modelContainerinterestPaid);
    } else {
      statement.bindNull(6 + start);
    }
    Double modelContainerinterestOutstanding = modelContainer.getDoubleValue("interestOutstanding");
    if (modelContainerinterestOutstanding != null) {
      statement.bindDouble(7 + start, modelContainerinterestOutstanding);
    } else {
      statement.bindNull(7 + start);
    }
    Double modelContainerfeeChargesCharged = modelContainer.getDoubleValue("feeChargesCharged");
    if (modelContainerfeeChargesCharged != null) {
      statement.bindDouble(8 + start, modelContainerfeeChargesCharged);
    } else {
      statement.bindNull(8 + start);
    }
    Double modelContainerfeeChargesPaid = modelContainer.getDoubleValue("feeChargesPaid");
    if (modelContainerfeeChargesPaid != null) {
      statement.bindDouble(9 + start, modelContainerfeeChargesPaid);
    } else {
      statement.bindNull(9 + start);
    }
    Integer modelContainerfeeChargesOutstanding = modelContainer.getIntegerValue("feeChargesOutstanding");
    if (modelContainerfeeChargesOutstanding != null) {
      statement.bindLong(10 + start, modelContainerfeeChargesOutstanding);
    } else {
      statement.bindNull(10 + start);
    }
    Integer modelContainerpenaltyChargesCharged = modelContainer.getIntegerValue("penaltyChargesCharged");
    if (modelContainerpenaltyChargesCharged != null) {
      statement.bindLong(11 + start, modelContainerpenaltyChargesCharged);
    } else {
      statement.bindNull(11 + start);
    }
    Integer modelContainerpenaltyChargesPaid = modelContainer.getIntegerValue("penaltyChargesPaid");
    if (modelContainerpenaltyChargesPaid != null) {
      statement.bindLong(12 + start, modelContainerpenaltyChargesPaid);
    } else {
      statement.bindNull(12 + start);
    }
    Integer modelContainerpenaltyChargesOutstanding = modelContainer.getIntegerValue("penaltyChargesOutstanding");
    if (modelContainerpenaltyChargesOutstanding != null) {
      statement.bindLong(13 + start, modelContainerpenaltyChargesOutstanding);
    } else {
      statement.bindNull(13 + start);
    }
    Double modelContainertotalExpectedRepayment = modelContainer.getDoubleValue("totalExpectedRepayment");
    if (modelContainertotalExpectedRepayment != null) {
      statement.bindDouble(14 + start, modelContainertotalExpectedRepayment);
    } else {
      statement.bindNull(14 + start);
    }
    Double modelContainertotalRepayment = modelContainer.getDoubleValue("totalRepayment");
    if (modelContainertotalRepayment != null) {
      statement.bindDouble(15 + start, modelContainertotalRepayment);
    } else {
      statement.bindNull(15 + start);
    }
    Double modelContainertotalOutstanding = modelContainer.getDoubleValue("totalOutstanding");
    if (modelContainertotalOutstanding != null) {
      statement.bindDouble(16 + start, modelContainertotalOutstanding);
    } else {
      statement.bindNull(16 + start);
    }
    Double modelContainertotalOverdue = modelContainer.getDoubleValue("totalOverdue");
    if (modelContainertotalOverdue != null) {
      statement.bindDouble(17 + start, modelContainertotalOverdue);
    } else {
      statement.bindNull(17 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Summary, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Summary, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Summary.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Summary, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Summary_Table.loanId.eq(modelContainer.getIntegerValue("loanId")));return clause;
  }

  @Override
  public final Summary toModel(ModelContainer<Summary, ?> modelContainer) {
    Summary model = new Summary();
    model.loanId = modelContainer.getIntegerValue("loanId");
    model.principalDisbursed = modelContainer.getIntegerValue("principalDisbursed");
    model.principalPaid = modelContainer.getDoubleValue("principalPaid");
    model.principalOutstanding = modelContainer.getDoubleValue("principalOutstanding");
    model.interestCharged = modelContainer.getDoubleValue("interestCharged");
    model.interestPaid = modelContainer.getDoubleValue("interestPaid");
    model.interestOutstanding = modelContainer.getDoubleValue("interestOutstanding");
    model.feeChargesCharged = modelContainer.getDoubleValue("feeChargesCharged");
    model.feeChargesPaid = modelContainer.getDoubleValue("feeChargesPaid");
    model.feeChargesOutstanding = modelContainer.getIntegerValue("feeChargesOutstanding");
    model.penaltyChargesCharged = modelContainer.getIntegerValue("penaltyChargesCharged");
    model.penaltyChargesPaid = modelContainer.getIntegerValue("penaltyChargesPaid");
    model.penaltyChargesOutstanding = modelContainer.getIntegerValue("penaltyChargesOutstanding");
    model.totalExpectedRepayment = modelContainer.getDoubleValue("totalExpectedRepayment");
    model.totalRepayment = modelContainer.getDoubleValue("totalRepayment");
    model.totalOutstanding = modelContainer.getDoubleValue("totalOutstanding");
    model.totalOverdue = modelContainer.getDoubleValue("totalOverdue");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Summary, ?> modelContainer) {
    int indexloanId = cursor.getColumnIndex("loanId");
    if (indexloanId != -1 && !cursor.isNull(indexloanId)) {
      modelContainer.put("loanId", cursor.getInt(indexloanId));
    } else {
      modelContainer.putDefault("loanId");
    }
    int indexprincipalDisbursed = cursor.getColumnIndex("principalDisbursed");
    if (indexprincipalDisbursed != -1 && !cursor.isNull(indexprincipalDisbursed)) {
      modelContainer.put("principalDisbursed", cursor.getInt(indexprincipalDisbursed));
    } else {
      modelContainer.putDefault("principalDisbursed");
    }
    int indexprincipalPaid = cursor.getColumnIndex("principalPaid");
    if (indexprincipalPaid != -1 && !cursor.isNull(indexprincipalPaid)) {
      modelContainer.put("principalPaid", cursor.getDouble(indexprincipalPaid));
    } else {
      modelContainer.putDefault("principalPaid");
    }
    int indexprincipalOutstanding = cursor.getColumnIndex("principalOutstanding");
    if (indexprincipalOutstanding != -1 && !cursor.isNull(indexprincipalOutstanding)) {
      modelContainer.put("principalOutstanding", cursor.getDouble(indexprincipalOutstanding));
    } else {
      modelContainer.putDefault("principalOutstanding");
    }
    int indexinterestCharged = cursor.getColumnIndex("interestCharged");
    if (indexinterestCharged != -1 && !cursor.isNull(indexinterestCharged)) {
      modelContainer.put("interestCharged", cursor.getDouble(indexinterestCharged));
    } else {
      modelContainer.putDefault("interestCharged");
    }
    int indexinterestPaid = cursor.getColumnIndex("interestPaid");
    if (indexinterestPaid != -1 && !cursor.isNull(indexinterestPaid)) {
      modelContainer.put("interestPaid", cursor.getDouble(indexinterestPaid));
    } else {
      modelContainer.putDefault("interestPaid");
    }
    int indexinterestOutstanding = cursor.getColumnIndex("interestOutstanding");
    if (indexinterestOutstanding != -1 && !cursor.isNull(indexinterestOutstanding)) {
      modelContainer.put("interestOutstanding", cursor.getDouble(indexinterestOutstanding));
    } else {
      modelContainer.putDefault("interestOutstanding");
    }
    int indexfeeChargesCharged = cursor.getColumnIndex("feeChargesCharged");
    if (indexfeeChargesCharged != -1 && !cursor.isNull(indexfeeChargesCharged)) {
      modelContainer.put("feeChargesCharged", cursor.getDouble(indexfeeChargesCharged));
    } else {
      modelContainer.putDefault("feeChargesCharged");
    }
    int indexfeeChargesPaid = cursor.getColumnIndex("feeChargesPaid");
    if (indexfeeChargesPaid != -1 && !cursor.isNull(indexfeeChargesPaid)) {
      modelContainer.put("feeChargesPaid", cursor.getDouble(indexfeeChargesPaid));
    } else {
      modelContainer.putDefault("feeChargesPaid");
    }
    int indexfeeChargesOutstanding = cursor.getColumnIndex("feeChargesOutstanding");
    if (indexfeeChargesOutstanding != -1 && !cursor.isNull(indexfeeChargesOutstanding)) {
      modelContainer.put("feeChargesOutstanding", cursor.getInt(indexfeeChargesOutstanding));
    } else {
      modelContainer.putDefault("feeChargesOutstanding");
    }
    int indexpenaltyChargesCharged = cursor.getColumnIndex("penaltyChargesCharged");
    if (indexpenaltyChargesCharged != -1 && !cursor.isNull(indexpenaltyChargesCharged)) {
      modelContainer.put("penaltyChargesCharged", cursor.getInt(indexpenaltyChargesCharged));
    } else {
      modelContainer.putDefault("penaltyChargesCharged");
    }
    int indexpenaltyChargesPaid = cursor.getColumnIndex("penaltyChargesPaid");
    if (indexpenaltyChargesPaid != -1 && !cursor.isNull(indexpenaltyChargesPaid)) {
      modelContainer.put("penaltyChargesPaid", cursor.getInt(indexpenaltyChargesPaid));
    } else {
      modelContainer.putDefault("penaltyChargesPaid");
    }
    int indexpenaltyChargesOutstanding = cursor.getColumnIndex("penaltyChargesOutstanding");
    if (indexpenaltyChargesOutstanding != -1 && !cursor.isNull(indexpenaltyChargesOutstanding)) {
      modelContainer.put("penaltyChargesOutstanding", cursor.getInt(indexpenaltyChargesOutstanding));
    } else {
      modelContainer.putDefault("penaltyChargesOutstanding");
    }
    int indextotalExpectedRepayment = cursor.getColumnIndex("totalExpectedRepayment");
    if (indextotalExpectedRepayment != -1 && !cursor.isNull(indextotalExpectedRepayment)) {
      modelContainer.put("totalExpectedRepayment", cursor.getDouble(indextotalExpectedRepayment));
    } else {
      modelContainer.putDefault("totalExpectedRepayment");
    }
    int indextotalRepayment = cursor.getColumnIndex("totalRepayment");
    if (indextotalRepayment != -1 && !cursor.isNull(indextotalRepayment)) {
      modelContainer.put("totalRepayment", cursor.getDouble(indextotalRepayment));
    } else {
      modelContainer.putDefault("totalRepayment");
    }
    int indextotalOutstanding = cursor.getColumnIndex("totalOutstanding");
    if (indextotalOutstanding != -1 && !cursor.isNull(indextotalOutstanding)) {
      modelContainer.put("totalOutstanding", cursor.getDouble(indextotalOutstanding));
    } else {
      modelContainer.putDefault("totalOutstanding");
    }
    int indextotalOverdue = cursor.getColumnIndex("totalOverdue");
    if (indextotalOverdue != -1 && !cursor.isNull(indextotalOverdue)) {
      modelContainer.put("totalOverdue", cursor.getDouble(indextotalOverdue));
    } else {
      modelContainer.putDefault("totalOverdue");
    }
  }

  @Override
  public final ForeignKeyContainer<Summary> toForeignKeyContainer(Summary model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Summary.class);
    modelContainer.put(Summary_Table.loanId, model.loanId);
    return modelContainer;
  }
}
