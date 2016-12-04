// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.dialogfragments.syncclientsdialog;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SyncClientsDialogFragment$$ViewBinder<T extends SyncClientsDialogFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558609, "field 'tv_sync_title'");
    target.tv_sync_title = finder.castView(view, 2131558609, "field 'tv_sync_title'");
    view = finder.findRequiredView(source, 2131558611, "field 'tv_syncing_client_name'");
    target.tv_syncing_client_name = finder.castView(view, 2131558611, "field 'tv_syncing_client_name'");
    view = finder.findRequiredView(source, 2131558613, "field 'tv_total_clients'");
    target.tv_total_clients = finder.castView(view, 2131558613, "field 'tv_total_clients'");
    view = finder.findRequiredView(source, 2131558615, "field 'tv_syncing_client'");
    target.tv_syncing_client = finder.castView(view, 2131558615, "field 'tv_syncing_client'");
    view = finder.findRequiredView(source, 2131558616, "field 'pb_syncing_client'");
    target.pb_syncing_client = finder.castView(view, 2131558616, "field 'pb_syncing_client'");
    view = finder.findRequiredView(source, 2131558618, "field 'tv_total_progress'");
    target.tv_total_progress = finder.castView(view, 2131558618, "field 'tv_total_progress'");
    view = finder.findRequiredView(source, 2131558619, "field 'pb_total_sync_client'");
    target.pb_total_sync_client = finder.castView(view, 2131558619, "field 'pb_total_sync_client'");
    view = finder.findRequiredView(source, 2131558622, "field 'tv_sync_failed'");
    target.tv_sync_failed = finder.castView(view, 2131558622, "field 'tv_sync_failed'");
    view = finder.findRequiredView(source, 2131558624, "field 'btn_hide' and method 'onClickHideButton'");
    target.btn_hide = finder.castView(view, 2131558624, "field 'btn_hide'");
    unbinder.view2131558624 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickHideButton();
      }
    });
    view = finder.findRequiredView(source, 2131558623, "field 'btn_cancel' and method 'onClickCancelButton'");
    target.btn_cancel = finder.castView(view, 2131558623, "field 'btn_cancel'");
    unbinder.view2131558623 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickCancelButton();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SyncClientsDialogFragment> implements Unbinder {
    private T target;

    View view2131558624;

    View view2131558623;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.tv_sync_title = null;
      target.tv_syncing_client_name = null;
      target.tv_total_clients = null;
      target.tv_syncing_client = null;
      target.pb_syncing_client = null;
      target.tv_total_progress = null;
      target.pb_total_sync_client = null;
      target.tv_sync_failed = null;
      view2131558624.setOnClickListener(null);
      target.btn_hide = null;
      view2131558623.setOnClickListener(null);
      target.btn_cancel = null;
    }
  }
}
