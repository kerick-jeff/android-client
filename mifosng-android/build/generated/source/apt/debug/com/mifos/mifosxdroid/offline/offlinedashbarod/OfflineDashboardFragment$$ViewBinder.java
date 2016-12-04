// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.offline.offlinedashbarod;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class OfflineDashboardFragment$$ViewBinder<T extends OfflineDashboardFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558843, "field 'rv_offline_dashboard'");
    target.rv_offline_dashboard = finder.castView(view, 2131558843, "field 'rv_offline_dashboard'");
    view = finder.findRequiredView(source, 2131558844, "field 'pb_offline_dashboard'");
    target.pb_offline_dashboard = finder.castView(view, 2131558844, "field 'pb_offline_dashboard'");
    view = finder.findRequiredView(source, 2131558846, "field 'mNoPayloadText'");
    target.mNoPayloadText = finder.castView(view, 2131558846, "field 'mNoPayloadText'");
    view = finder.findRequiredView(source, 2131558845, "field 'mNoPayloadIcon'");
    target.mNoPayloadIcon = finder.castView(view, 2131558845, "field 'mNoPayloadIcon'");
    view = finder.findRequiredView(source, 2131558681, "field 'll_error'");
    target.ll_error = finder.castView(view, 2131558681, "field 'll_error'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends OfflineDashboardFragment> implements Unbinder {
    private T target;

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
      target.rv_offline_dashboard = null;
      target.pb_offline_dashboard = null;
      target.mNoPayloadText = null;
      target.mNoPayloadIcon = null;
      target.ll_error = null;
    }
  }
}
