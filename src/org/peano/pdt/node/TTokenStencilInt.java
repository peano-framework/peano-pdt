/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.peano.pdt.node;

import org.peano.pdt.analysis.*;

@SuppressWarnings("nls")
public final class TTokenStencilInt extends Token
{
    public TTokenStencilInt()
    {
        super.setText("stencil(int):");
    }

    public TTokenStencilInt(int line, int pos)
    {
        super.setText("stencil(int):");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTokenStencilInt(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTokenStencilInt(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTokenStencilInt text.");
    }
}