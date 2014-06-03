/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.peano.pdt.node;

import org.peano.pdt.analysis.*;

@SuppressWarnings("nls")
public final class TTokenStencilComplex extends Token
{
    public TTokenStencilComplex()
    {
        super.setText("stencil(complex):");
    }

    public TTokenStencilComplex(int line, int pos)
    {
        super.setText("stencil(complex):");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTokenStencilComplex(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTokenStencilComplex(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTokenStencilComplex text.");
    }
}