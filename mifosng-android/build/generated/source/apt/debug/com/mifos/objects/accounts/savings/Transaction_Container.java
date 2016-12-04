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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Transaction_Container extends ModelContainerAdapter<Transaction> {
  public Transaction_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("savingsAccountId", Integer.class);
    columnMap.put("transactionType", TransactionType.class);
    columnMap.put("savingsTransactionDate", SavingsTransactionDate.class);
    columnMap.put("currency", Currency.class);
    columnMap.put("amount", Double.class);
    columnMap.put("runningBalance", Double.class);
  }

  @Override
  public final Class<Transaction> getModelClass() {
    return Transaction.class;
  }

  public final String getTableName() {
    return "`Transaction`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Transaction, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(Transaction_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(Transaction_Table.id.getCursorKey());
    }
    Integer modelContainersavingsAccountId = modelContainer.getIntegerValue("savingsAccountId");
    if (modelContainersavingsAccountId != null) {
      values.put(Transaction_Table.savingsAccountId.getCursorKey(), modelContainersavingsAccountId);
    } else {
      values.putNull(Transaction_Table.savingsAccountId.getCursorKey());
    }
    ModelContainer<TransactionType, ?> reftransactionType = modelContainer.getInstance(modelContainer.getValue("transactionType"), com.mifos.objects.accounts.savings.TransactionType.class);
    if (reftransactionType != null) {
      reftransactionType.save();
      Integer reftransactionTypeid = reftransactionType.getIntegerValue("id");
      if (reftransactionTypeid != null) {
        values.put(Transaction_Table.transactionType_id.getCursorKey(), reftransactionTypeid);
      } else {
        values.putNull(Transaction_Table.transactionType_id.getCursorKey());
      }
    } else {
      values.putNull("`transactionType_id`");
    }
    ModelContainer<SavingsTransactionDate, ?> refsavingsTransactionDate = modelContainer.getInstance(modelContainer.getValue("savingsTransactionDate"), com.mifos.objects.accounts.savings.SavingsTransactionDate.class);
    if (refsavingsTransactionDate != null) {
      refsavingsTransactionDate.save();
      Integer refsavingsTransactionDatetransactionId = refsavingsTransactionDate.getIntegerValue("transactionId");
      if (refsavingsTransactionDatetransactionId != null) {
        values.put(Transaction_Table.savingsTransactionDate_transactionId.getCursorKey(), refsavingsTransactionDatetransactionId);
      } else {
        values.putNull(Transaction_Table.savingsTransactionDate_transactionId.getCursorKey());
      }
    } else {
      values.putNull("`savingsTransactionDate_transactionId`");
    }
    ModelContainer<Currency, ?> refcurrency = modelContainer.getInstance(modelContainer.getValue("currency"), com.mifos.objects.accounts.savings.Currency.class);
    if (refcurrency != null) {
      refcurrency.save();
      String refcurrencycode = refcurrency.getStringValue("code");
      if (refcurrencycode != null) {
        values.put(Transaction_Table.currency_code.getCursorKey(), refcurrencycode);
      } else {
        values.putNull(Transaction_Table.currency_code.getCursorKey());
      }
    } else {
      values.putNull("`currency_code`");
    }
    Double modelContaineramount = modelContainer.getDoubleValue("amount");
    if (modelContaineramount != null) {
      values.put(Transaction_Table.amount.getCursorKey(), modelContaineramount);
    } else {
      values.putNull(Transaction_Table.amount.getCursorKey());
    }
    Double modelContainerrunningBalance = modelContainer.getDoubleValue("runningBalance");
    if (modelContainerrunningBalance != null) {
      values.put(Transaction_Table.runningBalance.getCursorKey(), modelContainerrunningBalance);
    } else {
      values.putNull(Transaction_Table.runningBalance.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Transaction, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Transaction, ?> modelContainer, int start) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      statement.bindLong(1 + start, modelContainerid);
    } else {
      statement.bindNull(1 + start);
    }
    Integer modelContainersavingsAccountId = modelContainer.getIntegerValue("savingsAccountId");
    if (modelContainersavingsAccountId != null) {
      statement.bindLong(2 + start, modelContainersavingsAccountId);
    } else {
      statement.bindNull(2 + start);
    }
    ModelContainer<TransactionType, ?> reftransactionType = modelContainer.getInstance(modelContainer.getValue("transactionType"), com.mifos.objects.accounts.savings.TransactionType.class);
    if (reftransactionType != null) {
      reftransactionType.save();
      Integer reftransactionTypeid = reftransactionType.getIntegerValue("id");
      if (reftransactionTypeid != null) {
        statement.bindLong(3 + start, reftransactionTypeid);
      } else {
        statement.bindNull(3 + start);
      }
    } else {
      statement.bindNull(3 + start);
    }
    ModelContainer<SavingsTransactionDate, ?> refsavingsTransactionDate = modelContainer.getInstance(modelContainer.getValue("savingsTransactionDate"), com.mifos.objects.accounts.savings.SavingsTransactionDate.class);
    if (refsavingsTransactionDate != null) {
      refsavingsTransactionDate.save();
      Integer refsavingsTransactionDatetransactionId = refsavingsTransactionDate.getIntegerValue("transactionId");
      if (refsavingsTransactionDatetransactionId != null) {
        statement.bindLong(4 + start, refsavingsTransactionDatetransactionId);
      } else {
        statement.bindNull(4 + start);
      }
    } else {
      statement.bindNull(4 + start);
    }
    ModelContainer<Currency, ?> refcurrency = modelContainer.getInstance(modelContainer.getValue("currency"), com.mifos.objects.accounts.savings.Currency.class);
    if (refcurrency != null) {
      refcurrency.save();
      String refcurrencycode = refcurrency.getStringValue("code");
      if (refcurrencycode != null) {
        statement.bindString(5 + start, refcurrencycode);
      } else {
        statement.bindNull(5 + start);
      }
    } else {
      statement.bindNull(5 + start);
    }
    Double modelContaineramount = modelContainer.getDoubleValue("amount");
    if (modelContaineramount != null) {
      statement.bindDouble(6 + start, modelContaineramount);
    } else {
      statement.bindNull(6 + start);
    }
    Double modelContainerrunningBalance = modelContainer.getDoubleValue("runningBalance");
    if (modelContainerrunningBalance != null) {
      statement.bindDouble(7 + start, modelContainerrunningBalance);
    } else {
      statement.bindNull(7 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Transaction, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Transaction, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Transaction.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Transaction, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Transaction_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final Transaction toModel(ModelContainer<Transaction, ?> modelContainer) {
    Transaction model = new Transaction();
    model.id = modelContainer.getIntegerValue("id");
    model.savingsAccountId = modelContainer.getIntegerValue("savingsAccountId");
    ModelContainer<TransactionType, ?> reftransactionType = modelContainer.getInstance(modelContainer.getValue("transactionType"), com.mifos.objects.accounts.savings.TransactionType.class);
    if (reftransactionType != null) {
      model.transactionType = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.savings.TransactionType.class).toModel(reftransactionType);
    }
    ModelContainer<SavingsTransactionDate, ?> refsavingsTransactionDate = modelContainer.getInstance(modelContainer.getValue("savingsTransactionDate"), com.mifos.objects.accounts.savings.SavingsTransactionDate.class);
    if (refsavingsTransactionDate != null) {
      model.savingsTransactionDate = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.savings.SavingsTransactionDate.class).toModel(refsavingsTransactionDate);
    }
    ModelContainer<Currency, ?> refcurrency = modelContainer.getInstance(modelContainer.getValue("currency"), com.mifos.objects.accounts.savings.Currency.class);
    if (refcurrency != null) {
      model.currency = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.accounts.savings.Currency.class).toModel(refcurrency);
    }
    model.amount = modelContainer.getDoubleValue("amount");
    model.runningBalance = modelContainer.getDoubleValue("runningBalance");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Transaction, ?> modelContainer) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexsavingsAccountId = cursor.getColumnIndex("savingsAccountId");
    if (indexsavingsAccountId != -1 && !cursor.isNull(indexsavingsAccountId)) {
      modelContainer.put("savingsAccountId", cursor.getInt(indexsavingsAccountId));
    } else {
      modelContainer.putDefault("savingsAccountId");
    }
    //// Only load model if references match, for efficiency
    int indextransactionType_id = cursor.getColumnIndex("transactionType_id");
    if (indextransactionType_id != -1 && !cursor.isNull(indextransactionType_id)) {
      modelContainer.put("transactionType", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.TransactionType.class).where()
          .and(com.mifos.objects.accounts.savings.TransactionType_Table.id.eq(cursor.getInt(indextransactionType_id))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.savings.TransactionType.class)).getData());
    } else {
      modelContainer.putDefault("transactionType");
    }
    //// Only load model if references match, for efficiency
    int indexsavingsTransactionDate_transactionId = cursor.getColumnIndex("savingsTransactionDate_transactionId");
    if (indexsavingsTransactionDate_transactionId != -1 && !cursor.isNull(indexsavingsTransactionDate_transactionId)) {
      modelContainer.put("savingsTransactionDate", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.SavingsTransactionDate.class).where()
          .and(com.mifos.objects.accounts.savings.SavingsTransactionDate_Table.transactionId.eq(cursor.getInt(indexsavingsTransactionDate_transactionId))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.savings.SavingsTransactionDate.class)).getData());
    } else {
      modelContainer.putDefault("savingsTransactionDate");
    }
    //// Only load model if references match, for efficiency
    int indexcurrency_code = cursor.getColumnIndex("currency_code");
    if (indexcurrency_code != -1 && !cursor.isNull(indexcurrency_code)) {
      modelContainer.put("currency", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.Currency.class).where()
          .and(com.mifos.objects.accounts.savings.Currency_Table.code.eq(cursor.getString(indexcurrency_code))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.accounts.savings.Currency.class)).getData());
    } else {
      modelContainer.putDefault("currency");
    }
    int indexamount = cursor.getColumnIndex("amount");
    if (indexamount != -1 && !cursor.isNull(indexamount)) {
      modelContainer.put("amount", cursor.getDouble(indexamount));
    } else {
      modelContainer.putDefault("amount");
    }
    int indexrunningBalance = cursor.getColumnIndex("runningBalance");
    if (indexrunningBalance != -1 && !cursor.isNull(indexrunningBalance)) {
      modelContainer.put("runningBalance", cursor.getDouble(indexrunningBalance));
    } else {
      modelContainer.putDefault("runningBalance");
    }
  }

  @Override
  public final ForeignKeyContainer<Transaction> toForeignKeyContainer(Transaction model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Transaction.class);
    modelContainer.put(Transaction_Table.id, model.id);
    return modelContainer;
  }
}
