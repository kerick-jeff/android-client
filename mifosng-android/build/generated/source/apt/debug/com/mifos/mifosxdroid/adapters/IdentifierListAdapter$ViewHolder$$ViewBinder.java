// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class IdentifierListAdapter$ViewHolder$$ViewBinder<T extends IdentifierListAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558990, "field 'tv_identifier_id'");
    target.tv_identifier_id = finder.castView(view, 2131558990, "field 'tv_identifier_id'");
    view = finder.findRequiredView(source, 2131558600, "field 'tv_identifier_type'");
    target.tv_identifier_type = finder.castView(view, 2131558600, "field 'tv_identifier_type'");
    view = finder.findRequiredView(source, 2131558992, "field 'tv_identifier_description'");
    target.tv_identifier_description = finder.castView(view, 2131558992, "field 'tv_identifier_description'");
    view = finder.findRequiredView(source, 2131558991, "field 'iv_identifier_options'");
    target.iv_identifier_options = finder.castView(view, 2131558991, "field 'iv_identifier_options'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends IdentifierListAdapter.ViewHolder> implements Unbinder {
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
      target.tv_identifier_id = null;
      target.tv_identifier_type = null;
      target.tv_identifier_description = null;
      target.iv_identifier_options = null;
    }
  }
}
