/*
 * Alien Chase 2013 -- a remake of Alien Chase 2012 (also developed by me)
 * Copyright (C) 2012, 2013 Dani Rodríguez <danirod@outlook.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tk.makigas.chase.actor;

import tk.makigas.chase.AlienChase;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * El pad es un actor que funciona como un botón en dispositivos móviles.
 * Sirve para permitir que el usuario lo pulse y así disparar algunos eventos.
 * 
 * @author danirod
 */
public class PadActor extends Actor {
	
	/** Textura usada por el botón. */
	private TextureRegion button;

	/**
	 * Crea un nuevo pad. La textura del pad contiene una tabla con las
	 * distintas texturas que pueden usar los pads. La textura que usa
	 * este pad se indica con los parámetros.
	 * 
	 * @param x columna de la textura.
	 * @param y fila de la textura.
	 */
	public PadActor(int x, int y) {
		button = new TextureRegion(AlienChase.MANAGER.get("pad.png", Texture.class), 32 * x, 32 * y, 32, 32);
		setSize(32, 32);
	}

	@Override
	public void draw(SpriteBatch batch, float parentAlpha) {
		batch.draw(button, getX(), getY());
	}
}
