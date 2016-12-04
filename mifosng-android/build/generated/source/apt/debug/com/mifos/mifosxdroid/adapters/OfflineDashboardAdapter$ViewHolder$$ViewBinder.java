// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class OfflineDashboardAdapter$ViewHolder$$ViewBinder<T extends OfflineDashboardAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558886, "field 'tv_item_count'");
    target.tv_item_count = finder.castView(view, 2131558886, "field 'tv_item_count'");
    view = finder.findRequiredView(source, 2131558885, "field 'tv_payload_name'");
    target.tv_payload_name = finder.castView(view, 2131558885, "field 'tv_payload_name'");
    view = finder.findRequiredView(source, 2131558884, "field 'iv_payload_image'");
    target.iv_payload_image = finder.castView(view, 2131558884, "field 'iv_payload_image'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends OfflineDashboardAdapter.ViewHolder> implements Unbinder {
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
      target.tv_item_count = null;
      target.tv_payload_name = null;
      target.iv_payload_image = null;
    }
  }
}
