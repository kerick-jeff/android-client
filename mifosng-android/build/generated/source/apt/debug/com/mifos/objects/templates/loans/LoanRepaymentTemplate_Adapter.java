package com.mifos.objects.templates.loans;

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

public final class LoanRepaymentTemplate_Adapter extends ModelAdapter<LoanRepaymentTemplate> {
  public LoanRepaymentTemplate_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<LoanRepaymentTemplate> getModelClass() {
    return LoanRepaymentTemplate.class;
  }

  public final String getTableName() {
    return "`LoanRepaymentTemplate`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return LoanRepaymentTemplate_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, LoanRepaymentTemplate model) {
    if (model.loanId != null) {
      values.put(LoanRepaymentTemplate_Table.loanId.getCursorKey(), model.loanId);
    } else {
      values.putNull(LoanRepaymentTemplate_Table.loanId.getCursorKey());
    }
    if (model.amount != null) {
      values.put(LoanRepaymentTemplate_Table.amount.getCursorKey(), model.amount);
    } else {
      values.putNull(LoanRepaymentTemplate_Table.amount.getCursorKey());
    }
    if (model.principalPortion != null) {
      values.put(LoanRepaymentTemplate_Table.principalPortion.getCursorKey(), model.principalPortion);
    } else {
      values.putNull(LoanRepaymentTemplate_Table.principalPortion.getCursorKey());
    }
    if (model.interestPortion != null) {
      values.put(LoanRepaymentTemplate_Table.interestPortion.getCursorKey(), model.interestPortion);
    } else {
      values.putNull(LoanRepaymentTemplate_Table.interestPortion.getCursorKey());
    }
    if (model.feeChargesPortion != null) {
      values.put(LoanRepaymentTemplate_Table.feeChargesPortion.getCursorKey(), model.feeChargesPortion);
    } else {
      values.putNull(LoanRepaymentTemplate_Table.feeChargesPortion.getCursorKey());
    }
    if (model.penaltyChargesPortion != null) {
      values.put(LoanRepaymentTemplate_Table.penaltyChargesPortion.getCursorKey(), model.penaltyChargesPortion);
    } else {
      values.putNull(LoanRepaymentTemplate_Table.penaltyChargesPortion.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, LoanRepaymentTemplate model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, LoanRepaymentTemplate model, int start) {
    if (model.loanId != null) {
      statement.bindLong(1 + start, model.loanId);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.amount != null) {
      statement.bindDouble(2 + start, model.amount);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.principalPortion != null) {
      statement.bindDouble(3 + start, model.principalPortion);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.interestPortion != null) {
      statement.bindDouble(4 + start, model.interestPortion);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.feeChargesPortion != null) {
      statement.bindLong(5 + start, model.feeChargesPortion);
    } else {
      statement.bindNull(5 + start);
    }
    if (model.penaltyChargesPortion != null) {
      statement.bindLong(6 + start, model.penaltyChargesPortion);
    } else {
      statement.bindNull(6 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, LoanRepaymentTemplate model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `LoanRepaymentTemplate`(`loanId`,`amount`,`principalPortion`,`interestPortion`,`feeChargesPortion`,`penaltyChargesPortion`) VALUES (?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `LoanRepaymentTemplate`(`loanId`,`amount`,`principalPortion`,`interestPortion`,`feeChargesPortion`,`penaltyChargesPortion`) VALUES (?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `LoanRepaymentTemplate`(`loanId` INTEGER,`amount` REAL,`principalPortion` REAL,`interestPortion` REAL,`feeChargesPortion` INTEGER,`penaltyChargesPortion` INTEGER, PRIMARY KEY(`loanId`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, LoanRepaymentTemplate model) {
    int indexloanId = cursor.getColumnIndex("loanId");
    if (indexloanId != -1 && !cursor.isNull(indexloanId)) {
      model.loanId = cursor.getInt(indexloanId);
    } else {
      model.loanId = null;
    }
    int indexamount = cursor.getColumnIndex("amount");
    if (indexamount != -1 && !cursor.isNull(indexamount)) {
      model.amount = cursor.getDouble(indexamount);
    } else {
      model.amount = null;
    }
    int indexprincipalPortion = cursor.getColumnIndex("principalPortion");
    if (indexprincipalPortion != -1 && !cursor.isNull(indexprincipalPortion)) {
      model.principalPortion = cursor.getDouble(indexprincipalPortion);
    } else {
      model.principalPortion = null;
    }
    int indexinterestPortion = cursor.getColumnIndex("interestPortion");
    if (indexinterestPortion != -1 && !cursor.isNull(indexinterestPortion)) {
      model.interestPortion = cursor.getDouble(indexinterestPortion);
    } else {
      model.interestPortion = null;
    }
    int indexfeeChargesPortion = cursor.getColumnIndex("feeChargesPortion");
    if (indexfeeChargesPortion != -1 && !cursor.isNull(indexfeeChargesPortion)) {
      model.feeChargesPortion = cursor.getInt(indexfeeChargesPortion);
    } else {
      model.feeChargesPortion = null;
    }
    int indexpenaltyChargesPortion = cursor.getColumnIndex("penaltyChargesPortion");
    if (indexpenaltyChargesPortion != -1 && !cursor.isNull(indexpenaltyChargesPortion)) {
      model.penaltyChargesPortion = cursor.getInt(indexpenaltyChargesPortion);
    } else {
      model.penaltyChargesPortion = null;
    }
  }

  @Override
  public final boolean exists(LoanRepaymentTemplate model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(LoanRepaymentTemplate.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(LoanRepaymentTemplate model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(LoanRepaymentTemplate_Table.loanId.eq(model.loanId));return clause;
  }

  @Override
  public final LoanRepaymentTemplate newInstance() {
    return new LoanRepaymentTemplate();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return LoanRepaymentTemplate_Table.getProperty(name);
  }
}
