import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
class SpielerTest {

    private Spieler spieler;

    @Mock
    private ArrayList<Pokemon> meinTeam;

    @Mock
    private Pokemon pokemon1;

    @BeforeEach
    public void setUp() {
        meinTeam = new ArrayList<>();
        meinTeam.add(pokemon1);



        when(spieler.addPokemon(pokemon1)).thenReturn(pokemon1);

        spieler = new Spieler();
    }


    @Test
    void addPokemon() {
assertThat(spieler.givemeinTeam().equals(pokemon1));

    }

    @Test
    void removePokemon() {



    }

    @Test
    void giveMeinTeam() {

        assertThat(spieler.givemeinTeam()).isEqualTo(meinTeam);

    }


}