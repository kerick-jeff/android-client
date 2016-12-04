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

public final class SavingsAccount_Adapter extends ModelAdapter<SavingsAccount> {
  public SavingsAccount_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<SavingsAccount> getModelClass() {
    return SavingsAccount.class;
  }

  public final String getTableName() {
    return "`SavingsAccount`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return SavingsAccount_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, SavingsAccount model) {
    values.put(SavingsAccount_Table.clientId.getCursorKey(), model.clientId);
    values.put(SavingsAccount_Table.groupId.getCursorKey(), model.groupId);
    if (model.id != null) {
      values.put(SavingsAccount_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(SavingsAccount_Table.id.getCursorKey());
    }
    if (model.accountNo != null) {
      values.put(SavingsAccount_Table.accountNo.getCursorKey(), model.accountNo);
    } else {
      values.putNull(SavingsAccount_Table.accountNo.getCursorKey());
    }
    if (model.productId != null) {
      values.put(SavingsAccount_Table.productId.getCursorKey(), model.productId);
    } else {
      values.putNull(SavingsAccount_Table.productId.getCursorKey());
    }
    if (model.productName != null) {
      values.put(SavingsAccount_Table.productName.getCursorKey(), model.productName);
    } else {
      values.putNull(SavingsAccount_Table.productName.getCursorKey());
    }
    if (model.status != null) {
      model.status.save();
      if (model.status.id != null) {
        values.put(SavingsAccount_Table.status_id.getCursorKey(), model.status.id);
      } else {
        values.putNull(SavingsAccount_Table.status_id.getCursorKey());
      }
    } else {
      values.putNull("`status_id`");
    }
    if (model.currency != null) {
      model.currency.save();
      if (model.currency.code != null) {
        values.put(SavingsAccount_Table.currency_code.getCursorKey(), model.currency.code);
      } else {
        values.putNull(SavingsAccount_Table.currency_code.getCursorKey());
      }
    } else {
      values.putNull("`currency_code`");
    }
    if (model.accountBalance != null) {
      values.put(SavingsAccount_Table.accountBalance.getCursorKey(), model.accountBalance);
    } else {
      values.putNull(SavingsAccount_Table.accountBalance.getCursorKey());
    }
    if (model.depositType != null) {
      model.depositType.save();
      if (model.depositType.id != null) {
        values.put(SavingsAccount_Table.depositType_id.getCursorKey(), model.depositType.id);
      } else {
        values.putNull(SavingsAccount_Table.depositType_id.getCursorKey());
      }
    } else {
      values.putNull("`depositType_id`");
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, SavingsAccount model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, SavingsAccount model, int start) {
    statement.bindLong(1 + start, model.clientId);
    statement.bindLong(2 + start, model.groupId);
    if (model.id != null) {
      statement.bindLong(3 + start, model.id);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.accountNo != null) {
      statement.bindString(4 + start, model.accountNo);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.productId != null) {
      statement.bindLong(5 + start, model.productId);
    } else {
      statement.bindNull(5 + start);
    }
    if (model.productName != null) {
      statement.bindString(6 + start, model.productName);
    } else {
      statement.bindNull(6 + start);
    }
    if (model.status != null) {
      model.status.save();
      if (model.status.id != null) {
        statement.bindLong(7 + start, model.status.id);
      } else {
        statement.bindNull(7 + start);
      }
    } else {
      statement.bindNull(7 + start);
    }
    if (model.currency != null) {
      model.currency.save();
      if (model.currency.code != null) {
        statement.bindString(8 + start, model.currency.code);
      } else {
        statement.bindNull(8 + start);
      }
    } else {
      statement.bindNull(8 + start);
    }
    if (model.accountBalance != null) {
      statement.bindDouble(9 + start, model.accountBalance);
    } else {
      statement.bindNull(9 + start);
    }
    if (model.depositType != null) {
      model.depositType.save();
      if (model.depositType.id != null) {
        statement.bindLong(10 + start, model.depositType.id);
      } else {
        statement.bindNull(10 + start);
      }
    } else {
      statement.bindNull(10 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, SavingsAccount model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `SavingsAccount`(`clientId`,`groupId`,`id`,`accountNo`,`productId`,`productName`,`status_id`,`currency_code`,`accountBalance`,`depositType_id`) VALUES (?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `SavingsAccount`(`clientId`,`groupId`,`id`,`accountNo`,`productId`,`productName`,`status_id`,`currency_code`,`accountBalance`,`depositType_id`) VALUES (?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `SavingsAccount`(`clientId` INTEGER,`groupId` INTEGER,`id` INTEGER,`accountNo` TEXT,`productId` INTEGER,`productName` TEXT,`status_id` INTEGER,`currency_code` TEXT,`accountBalance` REAL,`depositType_id` INTEGER, PRIMARY KEY(`id`)"+ ", FOREIGN KEY(`status_id`) REFERENCES " + FlowManager.getTableName(Status.class) + "(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION"+ ", FOREIGN KEY(`currency_code`) REFERENCES " + FlowManager.getTableName(Currency.class) + "(`code`) ON UPDATE NO ACTION ON DELETE NO ACTION"+ ", FOREIGN KEY(`depositType_id`) REFERENCES " + FlowManager.getTableName(DepositType.class) + "(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, SavingsAccount model) {
    int indexclientId = cursor.getColumnIndex("clientId");
    if (indexclientId != -1 && !cursor.isNull(indexclientId)) {
      model.clientId = cursor.getLong(indexclientId);
    } else {
      model.clientId = 0;
    }
    int indexgroupId = cursor.getColumnIndex("groupId");
    if (indexgroupId != -1 && !cursor.isNull(indexgroupId)) {
      model.groupId = cursor.getLong(indexgroupId);
    } else {
      model.groupId = 0;
    }
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = null;
    }
    int indexaccountNo = cursor.getColumnIndex("accountNo");
    if (indexaccountNo != -1 && !cursor.isNull(indexaccountNo)) {
      model.accountNo = cursor.getString(indexaccountNo);
    } else {
      model.accountNo = null;
    }
    int indexproductId = cursor.getColumnIndex("productId");
    if (indexproductId != -1 && !cursor.isNull(indexproductId)) {
      model.productId = cursor.getInt(indexproductId);
    } else {
      model.productId = null;
    }
    int indexproductName = cursor.getColumnIndex("productName");
    if (indexproductName != -1 && !cursor.isNull(indexproductName)) {
      model.productName = cursor.getString(indexproductName);
    } else {
      model.productName = null;
    }
    //// Only load model if references match, for efficiency
    int indexstatus_id = cursor.getColumnIndex("status_id");
    if (indexstatus_id != -1 && !cursor.isNull(indexstatus_id)) {
      model.status = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.Status.class).where()
          .and(com.mifos.objects.accounts.savings.Status_Table.id.eq(cursor.getInt(indexstatus_id))).querySingle();
    }
    //// Only load model if references match, for efficiency
    int indexcurrency_code = cursor.getColumnIndex("currency_code");
    if (indexcurrency_code != -1 && !cursor.isNull(indexcurrency_code)) {
      model.currency = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.Currency.class).where()
          .and(com.mifos.objects.accounts.savings.Currency_Table.code.eq(cursor.getString(indexcurrency_code))).querySingle();
    }
    int indexaccountBalance = cursor.getColumnIndex("accountBalance");
    if (indexaccountBalance != -1 && !cursor.isNull(indexaccountBalance)) {
      model.accountBalance = cursor.getDouble(indexaccountBalance);
    } else {
      model.accountBalance = null;
    }
    //// Only load model if references match, for efficiency
    int indexdepositType_id = cursor.getColumnIndex("depositType_id");
    if (indexdepositType_id != -1 && !cursor.isNull(indexdepositType_id)) {
      model.depositType = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.DepositType.class).where()
          .and(com.mifos.objects.accounts.savings.DepositType_Table.id.eq(cursor.getInt(indexdepositType_id))).querySingle();
    }
  }

  @Override
  public final boolean exists(SavingsAccount model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(SavingsAccount.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(SavingsAccount model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(SavingsAccount_Table.id.eq(model.id));return clause;
  }

  @Override
  public final SavingsAccount newInstance() {
    return new SavingsAccount();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return SavingsAccount_Table.getProperty(name);
  }
}
