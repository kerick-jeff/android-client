package com.mifos.objects.accounts.loan;

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
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

public final class LoanAccount_Adapter extends ModelAdapter<LoanAccount> {
  public LoanAccount_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<LoanAccount> getModelClass() {
    return LoanAccount.class;
  }

  public final String getTableName() {
    return "`LoanAccount`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return LoanAccount_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, LoanAccount model) {
    values.put(LoanAccount_Table.clientId.getCursorKey(), model.clientId);
    values.put(LoanAccount_Table.groupId.getCursorKey(), model.groupId);
    if (model.id != null) {
      values.put(LoanAccount_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(LoanAccount_Table.id.getCursorKey());
    }
    if (model.accountNo != null) {
      values.put(LoanAccount_Table.accountNo.getCursorKey(), model.accountNo);
    } else {
      values.putNull(LoanAccount_Table.accountNo.getCursorKey());
    }
    if (model.externalId != null) {
      values.put(LoanAccount_Table.externalId.getCursorKey(), model.externalId);
    } else {
      values.putNull(LoanAccount_Table.externalId.getCursorKey());
    }
    if (model.productId != null) {
      values.put(LoanAccount_Table.productId.getCursorKey(), model.productId);
    } else {
      values.putNull(LoanAccount_Table.productId.getCursorKey());
    }
    if (model.productName != null) {
      values.put(LoanAccount_Table.productName.getCursorKey(), model.productName);
    } else {
      values.putNull(LoanAccount_Table.productName.getCursorKey());
    }
    if (model.status != null) {
      model.status.save();
      if (model.status.id != null) {
        values.put(LoanAccount_Table.status_id.getCursorKey(), model.status.id);
      } else {
        values.putNull(LoanAccount_Table.status_id.getCursorKey());
      }
    } else {
      values.putNull("`status_id`");
    }
    if (model.loanType != null) {
      model.loanType.save();
      if (model.loanType.id != null) {
        values.put(LoanAccount_Table.loanType_id.getCursorKey(), model.loanType.id);
      } else {
        values.putNull(LoanAccount_Table.loanType_id.getCursorKey());
      }
    } else {
      values.putNull("`loanType_id`");
    }
    if (model.loanCycle != null) {
      values.put(LoanAccount_Table.loanCycle.getCursorKey(), model.loanCycle);
    } else {
      values.putNull(LoanAccount_Table.loanCycle.getCursorKey());
    }
    Integer refinArrears = model.inArrears != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.inArrears) : null;
    if (refinArrears != null) {
      values.put(LoanAccount_Table.inArrears.getCursorKey(), refinArrears);
    } else {
      values.putNull(LoanAccount_Table.inArrears.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, LoanAccount model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, LoanAccount model, int start) {
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
    if (model.externalId != null) {
      statement.bindString(5 + start, model.externalId);
    } else {
      statement.bindNull(5 + start);
    }
    if (model.productId != null) {
      statement.bindLong(6 + start, model.productId);
    } else {
      statement.bindNull(6 + start);
    }
    if (model.productName != null) {
      statement.bindString(7 + start, model.productName);
    } else {
      statement.bindNull(7 + start);
    }
    if (model.status != null) {
      model.status.save();
      if (model.status.id != null) {
        statement.bindLong(8 + start, model.status.id);
      } else {
        statement.bindNull(8 + start);
      }
    } else {
      statement.bindNull(8 + start);
    }
    if (model.loanType != null) {
      model.loanType.save();
      if (model.loanType.id != null) {
        statement.bindLong(9 + start, model.loanType.id);
      } else {
        statement.bindNull(9 + start);
      }
    } else {
      statement.bindNull(9 + start);
    }
    if (model.loanCycle != null) {
      statement.bindLong(10 + start, model.loanCycle);
    } else {
      statement.bindNull(10 + start);
    }
    Integer refinArrears = model.inArrears != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.inArrears) : null;
    if (refinArrears != null) {
      statement.bindLong(11 + start, refinArrears);
    } else {
      statement.bindNull(11 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, LoanAccount model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `LoanAccount`(`clientId`,`groupId`,`id`,`accountNo`,`externalId`,`productId`,`productName`,`status_id`,`loanType_id`,`loanCycle`,`inArrears`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `LoanAccount`(`clientId`,`groupId`,`id`,`accountNo`,`externalId`,`productId`,`productName`,`status_id`,`loanType_id`,`loanCycle`,`inArrears`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `LoanAccount`(`clientId` INTEGER,`groupId` INTEGER,`id` INTEGER,`accountNo` TEXT,`externalId` TEXT,`productId` INTEGER,`productName` TEXT,`status_id` INTEGER,`loanType_id` INTEGER,`loanCycle` INTEGER,`inArrears` INTEGER, PRIMARY KEY(`id`)"+ ", FOREIGN KEY(`status_id`) REFERENCES " + FlowManager.getTableName(Status.class) + "(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION"+ ", FOREIGN KEY(`loanType_id`) REFERENCES " + FlowManager.getTableName(LoanType.class) + "(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, LoanAccount model) {
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
    int indexexternalId = cursor.getColumnIndex("externalId");
    if (indexexternalId != -1 && !cursor.isNull(indexexternalId)) {
      model.externalId = cursor.getString(indexexternalId);
    } else {
      model.externalId = null;
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
      model.status = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.loan.Status.class).where()
          .and(com.mifos.objects.accounts.loan.Status_Table.id.eq(cursor.getInt(indexstatus_id))).querySingle();
    }
    //// Only load model if references match, for efficiency
    int indexloanType_id = cursor.getColumnIndex("loanType_id");
    if (indexloanType_id != -1 && !cursor.isNull(indexloanType_id)) {
      model.loanType = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.loan.LoanType.class).where()
          .and(com.mifos.objects.accounts.loan.LoanType_Table.id.eq(cursor.getInt(indexloanType_id))).querySingle();
    }
    int indexloanCycle = cursor.getColumnIndex("loanCycle");
    if (indexloanCycle != -1 && !cursor.isNull(indexloanCycle)) {
      model.loanCycle = cursor.getInt(indexloanCycle);
    } else {
      model.loanCycle = null;
    }
    int indexinArrears = cursor.getColumnIndex("inArrears");
    if (indexinArrears != -1 && !cursor.isNull(indexinArrears)) {
      model.inArrears = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexinArrears));
    } else {
      model.inArrears = null;
    }
  }

  @Override
  public final boolean exists(LoanAccount model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(LoanAccount.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(LoanAccount model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(LoanAccount_Table.id.eq(model.id));return clause;
  }

  @Override
  public final LoanAccount newInstance() {
    return new LoanAccount();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return LoanAccount_Table.getProperty(name);
  }
}
