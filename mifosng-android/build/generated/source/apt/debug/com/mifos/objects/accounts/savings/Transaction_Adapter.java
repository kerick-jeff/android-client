package com.mifos.objects.accounts.savings;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.config.FlowManager;
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

public final class Transaction_Adapter extends ModelAdapter<Transaction> {
  public Transaction_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Transaction> getModelClass() {
    return Transaction.class;
  }

  public final String getTableName() {
    return "`Transaction`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Transaction_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Transaction model) {
    if (model.id != null) {
      values.put(Transaction_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(Transaction_Table.id.getCursorKey());
    }
    if (model.savingsAccountId != null) {
      values.put(Transaction_Table.savingsAccountId.getCursorKey(), model.savingsAccountId);
    } else {
      values.putNull(Transaction_Table.savingsAccountId.getCursorKey());
    }
    if (model.transactionType != null) {
      model.transactionType.save();
      if (model.transactionType.id != null) {
        values.put(Transaction_Table.transactionType_id.getCursorKey(), model.transactionType.id);
      } else {
        values.putNull(Transaction_Table.transactionType_id.getCursorKey());
      }
    } else {
      values.putNull("`transactionType_id`");
    }
    if (model.savingsTransactionDate != null) {
      model.savingsTransactionDate.save();
      if (model.savingsTransactionDate.transactionId != null) {
        values.put(Transaction_Table.savingsTransactionDate_transactionId.getCursorKey(), model.savingsTransactionDate.transactionId);
      } else {
        values.putNull(Transaction_Table.savingsTransactionDate_transactionId.getCursorKey());
      }
    } else {
      values.putNull("`savingsTransactionDate_transactionId`");
    }
    if (model.currency != null) {
      model.currency.save();
      if (model.currency.code != null) {
        values.put(Transaction_Table.currency_code.getCursorKey(), model.currency.code);
      } else {
        values.putNull(Transaction_Table.currency_code.getCursorKey());
      }
    } else {
      values.putNull("`currency_code`");
    }
    if (model.amount != null) {
      values.put(Transaction_Table.amount.getCursorKey(), model.amount);
    } else {
      values.putNull(Transaction_Table.amount.getCursorKey());
    }
    if (model.runningBalance != null) {
      values.put(Transaction_Table.runningBalance.getCursorKey(), model.runningBalance);
    } else {
      values.putNull(Transaction_Table.runningBalance.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Transaction model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Transaction model, int start) {
    if (model.id != null) {
      statement.bindLong(1 + start, model.id);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.savingsAccountId != null) {
      statement.bindLong(2 + start, model.savingsAccountId);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.transactionType != null) {
      model.transactionType.save();
      if (model.transactionType.id != null) {
        statement.bindLong(3 + start, model.transactionType.id);
      } else {
        statement.bindNull(3 + start);
      }
    } else {
      statement.bindNull(3 + start);
    }
    if (model.savingsTransactionDate != null) {
      model.savingsTransactionDate.save();
      if (model.savingsTransactionDate.transactionId != null) {
        statement.bindLong(4 + start, model.savingsTransactionDate.transactionId);
      } else {
        statement.bindNull(4 + start);
      }
    } else {
      statement.bindNull(4 + start);
    }
    if (model.currency != null) {
      model.currency.save();
      if (model.currency.code != null) {
        statement.bindString(5 + start, model.currency.code);
      } else {
        statement.bindNull(5 + start);
      }
    } else {
      statement.bindNull(5 + start);
    }
    if (model.amount != null) {
      statement.bindDouble(6 + start, model.amount);
    } else {
      statement.bindNull(6 + start);
    }
    if (model.runningBalance != null) {
      statement.bindDouble(7 + start, model.runningBalance);
    } else {
      statement.bindNull(7 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Transaction model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Transaction`(`id`,`savingsAccountId`,`transactionType_id`,`savingsTransactionDate_transactionId`,`currency_code`,`amount`,`runningBalance`) VALUES (?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Transaction`(`id`,`savingsAccountId`,`transactionType_id`,`savingsTransactionDate_transactionId`,`currency_code`,`amount`,`runningBalance`) VALUES (?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Transaction`(`id` INTEGER,`savingsAccountId` INTEGER,`transactionType_id` INTEGER,`savingsTransactionDate_transactionId` INTEGER,`currency_code` TEXT,`amount` REAL,`runningBalance` REAL, PRIMARY KEY(`id`)"+ ", FOREIGN KEY(`transactionType_id`) REFERENCES " + FlowManager.getTableName(TransactionType.class) + "(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION"+ ", FOREIGN KEY(`savingsTransactionDate_transactionId`) REFERENCES " + FlowManager.getTableName(SavingsTransactionDate.class) + "(`transactionId`) ON UPDATE NO ACTION ON DELETE NO ACTION"+ ", FOREIGN KEY(`currency_code`) REFERENCES " + FlowManager.getTableName(Currency.class) + "(`code`) ON UPDATE NO ACTION ON DELETE NO ACTION" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Transaction model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = null;
    }
    int indexsavingsAccountId = cursor.getColumnIndex("savingsAccountId");
    if (indexsavingsAccountId != -1 && !cursor.isNull(indexsavingsAccountId)) {
      model.savingsAccountId = cursor.getInt(indexsavingsAccountId);
    } else {
      model.savingsAccountId = null;
    }
    //// Only load model if references match, for efficiency
    int indextransactionType_id = cursor.getColumnIndex("transactionType_id");
    if (indextransactionType_id != -1 && !cursor.isNull(indextransactionType_id)) {
      model.transactionType = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.TransactionType.class).where()
          .and(com.mifos.objects.accounts.savings.TransactionType_Table.id.eq(cursor.getInt(indextransactionType_id))).querySingle();
    }
    //// Only load model if references match, for efficiency
    int indexsavingsTransactionDate_transactionId = cursor.getColumnIndex("savingsTransactionDate_transactionId");
    if (indexsavingsTransactionDate_transactionId != -1 && !cursor.isNull(indexsavingsTransactionDate_transactionId)) {
      model.savingsTransactionDate = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.SavingsTransactionDate.class).where()
          .and(com.mifos.objects.accounts.savings.SavingsTransactionDate_Table.transactionId.eq(cursor.getInt(indexsavingsTransactionDate_transactionId))).querySingle();
    }
    //// Only load model if references match, for efficiency
    int indexcurrency_code = cursor.getColumnIndex("currency_code");
    if (indexcurrency_code != -1 && !cursor.isNull(indexcurrency_code)) {
      model.currency = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.Currency.class).where()
          .and(com.mifos.objects.accounts.savings.Currency_Table.code.eq(cursor.getString(indexcurrency_code))).querySingle();
    }
    int indexamount = cursor.getColumnIndex("amount");
    if (indexamount != -1 && !cursor.isNull(indexamount)) {
      model.amount = cursor.getDouble(indexamount);
    } else {
      model.amount = null;
    }
    int indexrunningBalance = cursor.getColumnIndex("runningBalance");
    if (indexrunningBalance != -1 && !cursor.isNull(indexrunningBalance)) {
      model.runningBalance = cursor.getDouble(indexrunningBalance);
    } else {
      model.runningBalance = null;
    }
  }

  @Override
  public final boolean exists(Transaction model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Transaction.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Transaction model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Transaction_Table.id.eq(model.id));return clause;
  }

  @Override
  public final Transaction newInstance() {
    return new Transaction();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Transaction_Table.getProperty(name);
  }
}
