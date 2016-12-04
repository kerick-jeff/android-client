package com.mifos.objects.accounts.savings;

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
    return "`SavingsAccountSummary`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Summary_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Summary model) {
    if (model.savingsId != null) {
      values.put(Summary_Table.savingsId.getCursorKey(), model.savingsId);
    } else {
      values.putNull(Summary_Table.savingsId.getCursorKey());
    }
    if (model.totalDeposits != null) {
      values.put(Summary_Table.totalDeposits.getCursorKey(), model.totalDeposits);
    } else {
      values.putNull(Summary_Table.totalDeposits.getCursorKey());
    }
    if (model.accountBalance != null) {
      values.put(Summary_Table.accountBalance.getCursorKey(), model.accountBalance);
    } else {
      values.putNull(Summary_Table.accountBalance.getCursorKey());
    }
    if (model.totalWithdrawals != null) {
      values.put(Summary_Table.totalWithdrawals.getCursorKey(), model.totalWithdrawals);
    } else {
      values.putNull(Summary_Table.totalWithdrawals.getCursorKey());
    }
    if (model.totalInterestEarned != null) {
      values.put(Summary_Table.totalInterestEarned.getCursorKey(), model.totalInterestEarned);
    } else {
      values.putNull(Summary_Table.totalInterestEarned.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Summary model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Summary model, int start) {
    if (model.savingsId != null) {
      statement.bindLong(1 + start, model.savingsId);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.totalDeposits != null) {
      statement.bindDouble(2 + start, model.totalDeposits);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.accountBalance != null) {
      statement.bindDouble(3 + start, model.accountBalance);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.totalWithdrawals != null) {
      statement.bindDouble(4 + start, model.totalWithdrawals);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.totalInterestEarned != null) {
      statement.bindDouble(5 + start, model.totalInterestEarned);
    } else {
      statement.bindNull(5 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Summary model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `SavingsAccountSummary`(`savingsId`,`totalDeposits`,`accountBalance`,`totalWithdrawals`,`totalInterestEarned`) VALUES (?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `SavingsAccountSummary`(`savingsId`,`totalDeposits`,`accountBalance`,`totalWithdrawals`,`totalInterestEarned`) VALUES (?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `SavingsAccountSummary`(`savingsId` INTEGER,`totalDeposits` REAL,`accountBalance` REAL,`totalWithdrawals` REAL,`totalInterestEarned` REAL, PRIMARY KEY(`savingsId`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Summary model) {
    int indexsavingsId = cursor.getColumnIndex("savingsId");
    if (indexsavingsId != -1 && !cursor.isNull(indexsavingsId)) {
      model.savingsId = cursor.getInt(indexsavingsId);
    } else {
      model.savingsId = null;
    }
    int indextotalDeposits = cursor.getColumnIndex("totalDeposits");
    if (indextotalDeposits != -1 && !cursor.isNull(indextotalDeposits)) {
      model.totalDeposits = cursor.getDouble(indextotalDeposits);
    } else {
      model.totalDeposits = null;
    }
    int indexaccountBalance = cursor.getColumnIndex("accountBalance");
    if (indexaccountBalance != -1 && !cursor.isNull(indexaccountBalance)) {
      model.accountBalance = cursor.getDouble(indexaccountBalance);
    } else {
      model.accountBalance = null;
    }
    int indextotalWithdrawals = cursor.getColumnIndex("totalWithdrawals");
    if (indextotalWithdrawals != -1 && !cursor.isNull(indextotalWithdrawals)) {
      model.totalWithdrawals = cursor.getDouble(indextotalWithdrawals);
    } else {
      model.totalWithdrawals = null;
    }
    int indextotalInterestEarned = cursor.getColumnIndex("totalInterestEarned");
    if (indextotalInterestEarned != -1 && !cursor.isNull(indextotalInterestEarned)) {
      model.totalInterestEarned = cursor.getDouble(indextotalInterestEarned);
    } else {
      model.totalInterestEarned = null;
    }
  }

  @Override
  public final boolean exists(Summary model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Summary.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Summary model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Summary_Table.savingsId.eq(model.savingsId));return clause;
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
