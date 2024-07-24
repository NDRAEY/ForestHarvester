package ru.akt.forestharvester;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    FitViewport viewport;
	OrthographicCamera camera;
    ShapeRenderer shape_renderer;

    public final static float WIDTH = 100;
    public final static float HEIGHT = 16 * WIDTH / 9;

    @Override
    public void create() {
		shape_renderer = new ShapeRenderer();
		camera = new OrthographicCamera();
		viewport = new FitViewport(WIDTH, HEIGHT, camera);
    }

    @Override
    public void render() {
        shape_renderer.begin(ShapeType.Line);
		shape_renderer.setColor(Color.RED);
		shape_renderer.rect(10, 10, 30, 30);
		shape_renderer.end();
    }

    @Override
    public void dispose() {
        shape_renderer.dispose();
    }
}
