// This file is part of MicropolisJ.
// Copyright (C) 2013 Jason Long
// Portions Copyright (C) 1989-2007 Electronic Arts Inc.
//
// MicropolisJ is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package micropolisj.engine;

/**
 * Implements Coin Rush (one of the Micropolis bonanzas).
 */
public class CoinSprite extends Sprite
{
	boolean flag;
	int count;

	public CoinSprite(Micropolis engine, int xpos, int ypos)
	{
		super(engine, SpriteKind.COIN);
		this.x = xpos * 16 + 8;
		this.y = ypos * 16 + 8;
		this.width = 48;
		this.height = 48;
		this.offx = -24;
		this.offy = -40;

		this.frame = 1;
		this.count = 150;
	}

	@Override
	public void moveImpl()
	{
		int z = this.frame;

		this.frame++;

		if (this.frame > 6) { // loop through coin animation
			this.frame = 1;
		}
			

		if (this.count > 0) {
			this.count--;
		}

		if (this.count == 0) {
			// early termination after a certain period of time
			this.frame = 0;
			return;
		}
	}
}
