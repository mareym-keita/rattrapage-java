public class BienServiceTest {
    private EntityManager em;
    private BienService bienService;

    @Before
    public void setUp() {
        em = mock(EntityManager.class);
        bienService = new BienService(em);
    }

    @Test
    public void testCreateBien() {
        Bien bien = new Bien();
        bien.setNom("Bien1");
        bien.setDescription("Description du bien");
        bien.setPrix(1000.0);

        when(em.persist(any(Bien.class))).thenReturn(null);

        Bien result = bienService.createBien(bien);
        assertNotNull(result);
        verify(em).persist(bien);
    }
}
