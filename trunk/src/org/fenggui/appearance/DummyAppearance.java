/*
 * FengGUI - Java GUIs in OpenGL (http://www.fenggui.org)
 * 
 * Copyright (C) 2005, 2006 FengGUI Project
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details:
 * http://www.gnu.org/copyleft/lesser.html#TOC3
 * 
 * Created on Dec 6, 2006
 * $Id: DummyAppearance.java 397 2007-11-19 13:53:14Z marcmenghin $
 */
package org.fenggui.appearance;

import org.fenggui.binding.render.Graphics;
import org.fenggui.binding.render.IOpenGL;
import org.fenggui.util.Dimension;

public class DummyAppearance implements IAppearance
{

	public Dimension getMinSizeHint()
	{
		return new Dimension(0,0);
	}

	public void paint(Graphics g, IOpenGL gl)
	{
		// do nothing
	}

}
