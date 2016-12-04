package com.mifos.objects.accounts.loan;

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

public final class Summary_Adapter extends ModelAdapter<Summary> {
  public Summary_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Summary> getModelClass() {
    return Summary.class;
  }

  public final String getTableName() {
    return "`LoansAccountSummary`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Summary_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Summary model) {
    if (model.loanId != null) {
      values.put(Summary_Table.loanId.getCursorKey(), model.loanId);
    } else {
      values.putNull(Summary_Table.loanId.getCursorKey());
    }
    if (model.principalDisbursed != null) {
      values.put(Summary_Table.principalDisbursed.getCursorKey(), model.principalDisbursed);
    } else {
      values.putNull(Summary_Table.principalDisbursed.getCursorKey());
    }
    if (model.principalPaid != null) {
      values.put(Summary_Table.principalPaid.getCursorKey(), model.principalPaid);
    } else {
      values.putNull(Summary_Table.principalPaid.getCursorKey());
    }
    if (model.principalOutstanding != null) {
      values.put(Summary_Table.principalOutstanding.getCursorKey(), model.principalOutstanding);
    } else {
      values.putNull(Summary_Table.principalOutstanding.getCursorKey());
    }
    if (model.interestCharged != null) {
      values.put(Summary_Table.interestCharged.getCursorKey(), model.interestCharged);
    } else {
      values.putNull(Summary_Table.interestCharged.getCursorKey());
    }
    if (model.interestPaid != null) {
      values.put(Summary_Table.interestPaid.getCursorKey(), model.interestPaid);
    } else {
      values.putNull(Summary_Table.interestPaid.getCursorKey());
    }
    if (model.interestOutstanding != null) {
      values.put(Summary_Table.interestOutstanding.getCursorKey(), model.interestOutstanding);
    } else {
      values.putNull(Summary_Table.interestOutstanding.getCursorKey());
    }
    if (model.feeChargesCharged != null) {
      values.put(Summary_Table.feeChargesCharged.getCursorKey(), model.feeChargesCharged);
    } else {
      values.putNull(Summary_Table.feeChargesCharged.getCursorKey());
    }
    if (model.feeChargesPaid != null) {
      values.put(Summary_Table.feeChargesPaid.getCursorKey(), model.feeChargesPaid);
    } else {
      values.putNull(Summary_Table.feeChargesPaid.getCursorKey());
    }
    if (model.feeChargesOutstanding != null) {
      values.put(Summary_Table.feeChargesOutstanding.getCursorKey(), model.feeChargesOutstanding);
    } else {
      values.putNull(Summary_Table.feeChargesOutstanding.getCursorKey());
    }
    if (model.penaltyChargesCharged != null) {
      values.put(Summary_Table.penaltyChargesCharged.getCursorKey(), model.penaltyChargesCharged);
    } else {
      values.putNull(Summary_Table.penaltyChargesCharged.getCursorKey());
    }
    if (model.penaltyChargesPaid != null) {
      values.put(Summary_Table.penaltyChargesPaid.getCursorKey(), model.penaltyChargesPaid);
    } else {
      values.putNull(Summary_Table.penaltyChargesPaid.getCursorKey());
    }
    if (model.penaltyChargesOutstanding != null) {
      values.put(Summary_Table.penaltyChargesOutstanding.getCursorKey(), model.penaltyChargesOutstanding);
    } else {
      values.putNull(Summary_Table.penaltyChargesOutstanding.getCursorKey());
    }
    if (model.totalExpectedRepayment != null) {
      values.put(Summary_Table.totalExpectedRepayment.getCursorKey(), model.totalExpectedRepayment);
    } else {
      values.putNull(Summary_Table.totalExpectedRepayment.getCursorKey());
    }
    if (model.totalRepayment != null) {
      values.put(Summary_Table.totalRepayment.getCursorKey(), model.totalRepayment);
    } else {
      values.putNull(Summary_Table.totalRepayment.getCursorKey());
    }
    if (model.totalOutstanding != null) {
      values.put(Summary_Table.totalOutstanding.getCursorKey(), model.totalOutstanding);
    } else {
      values.putNull(Summary_Table.totalOutstanding.getCursorKey());
    }
    if (model.totalOverdue != null) {
      values.put(Summary_Table.totalOverdue.getCursorKey(), model.totalOverdue);
    } else {
      values.putNull(Summary_Table.totalOverdue.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Summary model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Summary model, int start) {
    if (model.loanId != null) {
      statement.bindLong(1 + start, model.loanId);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.principalDisbursed != null) {
      statement.bindLong(2 + start, model.principalDisbursed);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.principalPaid != null) {
      statement.bindDouble(3 + start, model.principalPaid);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.principalOutstanding != null) {
      statement.bindDouble(4 + start, model.principalOutstanding);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.interestCharged != null) {
      statement.bindDouble(5 + start, model.interestCharged);
    } else {
      statement.bindNull(5 + start);
    }
    if (model.interestPaid != null) {
      statement.bindDouble(6 + start, model.interestPaid);
    } else {
      statement.bindNull(6 + start);
    }
    if (model.interestOutstanding != null) {
      statement.bindDouble(7 + start, model.interestOutstanding);
    } else {
      statement.bindNull(7 + start);
    }
    if (model.feeChargesCharged != null) {
      statement.bindDouble(8 + start, model.feeChargesCharged);
    } else {
      statement.bindNull(8 + start);
    }
    if (model.feeChargesPaid != null) {
      statement.bindDouble(9 + start, model.feeChargesPaid);
    } else {
      statement.bindNull(9 + start);
    }
    if (model.feeChargesOutstanding != null) {
      statement.bindLong(10 + start, model.feeChargesOutstanding);
    } else {
      statement.bindNull(10 + start);
    }
    if (model.penaltyChargesCharged != null) {
      statement.bindLong(11 + start, model.penaltyChargesCharged);
    } else {
      statement.bindNull(11 + start);
    }
    if (model.penaltyChargesPaid != null) {
      statement.bindLong(12 + start, model.penaltyChargesPaid);
    } else {
      statement.bindNull(12 + start);
    }
    if (model.penaltyChargesOutstanding != null) {
      statement.bindLong(13 + start, model.penaltyChargesOutstanding);
    } else {
      statement.bindNull(13 + start);
    }
    if (model.totalExpectedRepayment != null) {
      statement.bindDouble(14 + start, model.totalExpectedRepayment);
    } else {
      statement.bindNull(14 + start);
    }
    if (model.totalRepayment != null) {
      statement.bindDouble(15 + start, model.totalRepayment);
    } else {
      statement.bindNull(15 + start);
    }
    if (model.totalOutstanding != null) {
      statement.bindDouble(16 + start, model.totalOutstanding);
    } else {
      statement.bindNull(16 + start);
    }
    if (model.totalOverdue != null) {
      statement.bindDouble(17 + start, model.totalOverdue);
    } else {
      statement.bindNull(17 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Summary model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `LoansAccountSummary`(`loanId`,`principalDisbursed`,`principalPaid`,`principalOutstanding`,`interestCharged`,`interestPaid`,`interestOutstanding`,`feeChargesCharged`,`feeChargesPaid`,`feeChargesOutstanding`,`penaltyChargesCharged`,`penaltyChargesPaid`,`penaltyChargesOutstanding`,`totalExpectedRepayment`,`totalRepayment`,`totalOutstanding`,`totalOverdue`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `LoansAccountSummary`(`loanId`,`principalDisbursed`,`principalPaid`,`principalOutstanding`,`interestCharged`,`interestPaid`,`interestOutstanding`,`feeChargesCharged`,`feeChargesPaid`,`feeChargesOutstanding`,`penaltyChargesCharged`,`penaltyChargesPaid`,`penaltyChargesOutstanding`,`totalExpectedRepayment`,`totalRepayment`,`totalOutstanding`,`totalOverdue`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `LoansAccountSummary`(`loanId` INTEGER,`principalDisbursed` INTEGER,`principalPaid` REAL,`principalOutstanding` REAL,`interestCharged` REAL,`interestPaid` REAL,`interestOutstanding` REAL,`feeChargesCharged` REAL,`feeChargesPaid` REAL,`feeChargesOutstanding` INTEGER,`penaltyChargesCharged` INTEGER,`penaltyChargesPaid` INTEGER,`penaltyChargesOutstanding` INTEGER,`totalExpectedRepayment` REAL,`totalRepayment` REAL,`totalOutstanding` REAL,`totalOverdue` REAL, PRIMARY KEY(`loanId`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Summary model) {
    int indexloanId = cursor.getColumnIndex("loanId");
    if (indexloanId != -1 && !cursor.isNull(indexloanId)) {
      model.loanId = cursor.getInt(indexloanId);
    } else {
      model.loanId = null;
    }
    int indexprincipalDisbursed = cursor.getColumnIndex("principalDisbursed");
    if (indexprincipalDisbursed != -1 && !cursor.isNull(indexprincipalDisbursed)) {
      model.principalDisbursed = cursor.getInt(indexprincipalDisbursed);
    } else {
      model.principalDisbursed = null;
    }
    int indexprincipalPaid = cursor.getColumnIndex("principalPaid");
    if (indexprincipalPaid != -1 && !cursor.isNull(indexprincipalPaid)) {
      model.principalPaid = cursor.getDouble(indexprincipalPaid);
    } else {
      model.principalPaid = null;
    }
    int indexprincipalOutstanding = cursor.getColumnIndex("principalOutstanding");
    if (indexprincipalOutstanding != -1 && !cursor.isNull(indexprincipalOutstanding)) {
      model.principalOutstanding = cursor.getDouble(indexprincipalOutstanding);
    } else {
      model.principalOutstanding = null;
    }
    int indexinterestCharged = cursor.getColumnIndex("interestCharged");
    if (indexinterestCharged != -1 && !cursor.isNull(indexinterestCharged)) {
      model.interestCharged = cursor.getDouble(indexinterestCharged);
    } else {
      model.interestCharged = null;
    }
    int indexinterestPaid = cursor.getColumnIndex("interestPaid");
    if (indexinterestPaid != -1 && !cursor.isNull(indexinterestPaid)) {
      model.interestPaid = cursor.getDouble(indexinterestPaid);
    } else {
      model.interestPaid = null;
    }
    int indexinterestOutstanding = cursor.getColumnIndex("interestOutstanding");
    if (indexinterestOutstanding != -1 && !cursor.isNull(indexinterestOutstanding)) {
      model.interestOutstanding = cursor.getDouble(indexinterestOutstanding);
    } else {
      model.interestOutstanding = null;
    }
    int indexfeeChargesCharged = cursor.getColumnIndex("feeChargesCharged");
    if (indexfeeChargesCharged != -1 && !cursor.isNull(indexfeeChargesCharged)) {
      model.feeChargesCharged = cursor.getDouble(indexfeeChargesCharged);
    } else {
      model.feeChargesCharged = null;
    }
    int indexfeeChargesPaid = cursor.getColumnIndex("feeChargesPaid");
    if (indexfeeChargesPaid != -1 && !cursor.isNull(indexfeeChargesPaid)) {
      model.feeChargesPaid = cursor.getDouble(indexfeeChargesPaid);
    } else {
      model.feeChargesPaid = null;
    }
    int indexfeeChargesOutstanding = cursor.getColumnIndex("feeChargesOutstanding");
    if (indexfeeChargesOutstanding != -1 && !cursor.isNull(indexfeeChargesOutstanding)) {
      model.feeChargesOutstanding = cursor.getInt(indexfeeChargesOutstanding);
    } else {
      model.feeChargesOutstanding = null;
    }
    int indexpenaltyChargesCharged = cursor.getColumnIndex("penaltyChargesCharged");
    if (indexpenaltyChargesCharged != -1 && !cursor.isNull(indexpenaltyChargesCharged)) {
      model.penaltyChargesCharged = cursor.getInt(indexpenaltyChargesCharged);
    } else {
      model.penaltyChargesCharged = null;
    }
    int indexpenaltyChargesPaid = cursor.getColumnIndex("penaltyChargesPaid");
    if (indexpenaltyChargesPaid != -1 && !cursor.isNull(indexpenaltyChargesPaid)) {
      model.penaltyChargesPaid = cursor.getInt(indexpenaltyChargesPaid);
    } else {
      model.penaltyChargesPaid = null;
    }
    int indexpenaltyChargesOutstanding = cursor.getColumnIndex("penaltyChargesOutstanding");
    if (indexpenaltyChargesOutstanding != -1 && !cursor.isNull(indexpenaltyChargesOutstanding)) {
      model.penaltyChargesOutstanding = cursor.getInt(indexpenaltyChargesOutstanding);
    } else {
      model.penaltyChargesOutstanding = null;
    }
    int indextotalExpectedRepayment = cursor.getColumnIndex("totalExpectedRepayment");
    if (indextotalExpectedRepayment != -1 && !cursor.isNull(indextotalExpectedRepayment)) {
      model.totalExpectedRepayment = cursor.getDouble(indextotalExpectedRepayment);
    } else {
      model.totalExpectedRepayment = null;
    }
    int indextotalRepayment = cursor.getColumnIndex("totalRepayment");
    if (indextotalRepayment != -1 && !cursor.isNull(indextotalRepayment)) {
      model.totalRepayment = cursor.getDouble(indextotalRepayment);
    } else {
      model.totalRepayment = null;
    }
    int indextotalOutstanding = cursor.getColumnIndex("totalOutstanding");
    if (indextotalOutstanding != -1 && !cursor.isNull(indextotalOutstanding)) {
      model.totalOutstanding = cursor.getDouble(indextotalOutstanding);
    } else {
      model.totalOutstanding = null;
    }
    int indextotalOverdue = cursor.getColumnIndex("totalOverdue");
    if (indextotalOverdue != -1 && !cursor.isNull(indextotalOverdue)) {
      model.totalOverdue = cursor.getDouble(indextotalOverdue);
    } else {
      model.totalOverdue = null;
    }
  }

  @Override
  public final boolean exists(Summary model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Summary.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Summary model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Summary_Table.loanId.eq(model.loanId));return clause;
  }

  @Override
  public final Summary newInstance() {
    return new Summary();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Summary_Table.getProperty(name);
  }
}
