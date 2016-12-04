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

public final class SavingsAccountWithAssociations_Adapter extends ModelAdapter<SavingsAccountWithAssociations> {
  public SavingsAccountWithAssociations_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<SavingsAccountWithAssociations> getModelClass() {
    return SavingsAccountWithAssociations.class;
  }

  public final String getTableName() {
    return "`SavingsAccountWithAssociations`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return SavingsAccountWithAssociations_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, SavingsAccountWithAssociations model) {
    if (model.id != null) {
      values.put(SavingsAccountWithAssociations_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(SavingsAccountWithAssociations_Table.id.getCursorKey());
    }
    if (model.accountNo != null) {
      values.put(SavingsAccountWithAssociations_Table.accountNo.getCursorKey(), model.accountNo);
    } else {
      values.putNull(SavingsAccountWithAssociations_Table.accountNo.getCursorKey());
    }
    if (model.clientName != null) {
      values.put(SavingsAccountWithAssociations_Table.clientName.getCursorKey(), model.clientName);
    } else {
      values.putNull(SavingsAccountWithAssociations_Table.clientName.getCursorKey());
    }
    if (model.savingsProductName != null) {
      values.put(SavingsAccountWithAssociations_Table.savingsProductName.getCursorKey(), model.savingsProductName);
    } else {
      values.putNull(SavingsAccountWithAssociations_Table.savingsProductName.getCursorKey());
    }
    if (model.status != null) {
      model.status.save();
      if (model.status.id != null) {
        values.put(SavingsAccountWithAssociations_Table.status_id.getCursorKey(), model.status.id);
      } else {
        values.putNull(SavingsAccountWithAssociations_Table.status_id.getCursorKey());
      }
    } else {
      values.putNull("`status_id`");
    }
    if (model.summary != null) {
      model.summary.save();
      if (model.summary.savingsId != null) {
        values.put(SavingsAccountWithAssociations_Table.summary_savingsId.getCursorKey(), model.summary.savingsId);
      } else {
        values.putNull(SavingsAccountWithAssociations_Table.summary_savingsId.getCursorKey());
      }
    } else {
      values.putNull("`summary_savingsId`");
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, SavingsAccountWithAssociations model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, SavingsAccountWithAssociations model, int start) {
    if (model.id != null) {
      statement.bindLong(1 + start, model.id);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.accountNo != null) {
      statement.bindString(2 + start, model.accountNo);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.clientName != null) {
      statement.bindString(3 + start, model.clientName);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.savingsProductName != null) {
      statement.bindString(4 + start, model.savingsProductName);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.status != null) {
      model.status.save();
      if (model.status.id != null) {
        statement.bindLong(5 + start, model.status.id);
      } else {
        statement.bindNull(5 + start);
      }
    } else {
      statement.bindNull(5 + start);
    }
    if (model.summary != null) {
      model.summary.save();
      if (model.summary.savingsId != null) {
        statement.bindLong(6 + start, model.summary.savingsId);
      } else {
        statement.bindNull(6 + start);
      }
    } else {
      statement.bindNull(6 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, SavingsAccountWithAssociations model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `SavingsAccountWithAssociations`(`id`,`accountNo`,`clientName`,`savingsProductName`,`status_id`,`summary_savingsId`) VALUES (?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `SavingsAccountWithAssociations`(`id`,`accountNo`,`clientName`,`savingsProductName`,`status_id`,`summary_savingsId`) VALUES (?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `SavingsAccountWithAssociations`(`id` INTEGER,`accountNo` TEXT,`clientName` TEXT,`savingsProductName` TEXT,`status_id` INTEGER,`summary_savingsId` INTEGER, PRIMARY KEY(`id`)"+ ", FOREIGN KEY(`status_id`) REFERENCES " + FlowManager.getTableName(Status.class) + "(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION"+ ", FOREIGN KEY(`summary_savingsId`) REFERENCES " + FlowManager.getTableName(Summary.class) + "(`savingsId`) ON UPDATE NO ACTION ON DELETE NO ACTION" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, SavingsAccountWithAssociations model) {
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
    int indexclientName = cursor.getColumnIndex("clientName");
    if (indexclientName != -1 && !cursor.isNull(indexclientName)) {
      model.clientName = cursor.getString(indexclientName);
    } else {
      model.clientName = null;
    }
    int indexsavingsProductName = cursor.getColumnIndex("savingsProductName");
    if (indexsavingsProductName != -1 && !cursor.isNull(indexsavingsProductName)) {
      model.savingsProductName = cursor.getString(indexsavingsProductName);
    } else {
      model.savingsProductName = null;
    }
    //// Only load model if references match, for efficiency
    int indexstatus_id = cursor.getColumnIndex("status_id");
    if (indexstatus_id != -1 && !cursor.isNull(indexstatus_id)) {
      model.status = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.Status.class).where()
          .and(com.mifos.objects.accounts.savings.Status_Table.id.eq(cursor.getInt(indexstatus_id))).querySingle();
    }
    //// Only load model if references match, for efficiency
    int indexsummary_savingsId = cursor.getColumnIndex("summary_savingsId");
    if (indexsummary_savingsId != -1 && !cursor.isNull(indexsummary_savingsId)) {
      model.summary = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.savings.Summary.class).where()
          .and(com.mifos.objects.accounts.savings.Summary_Table.savingsId.eq(cursor.getInt(indexsummary_savingsId))).querySingle();
    }
  }

  @Override
  public final boolean exists(SavingsAccountWithAssociations model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(SavingsAccountWithAssociations.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(SavingsAccountWithAssociations model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(SavingsAccountWithAssociations_Table.id.eq(model.id));return clause;
  }

  @Override
  public final SavingsAccountWithAssociations newInstance() {
    return new SavingsAccountWithAssociations();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return SavingsAccountWithAssociations_Table.getProperty(name);
  }
}
