enum class Estado(val estado: String) {
    PDTE("pdte"),
    PGDO("pgdo"),
    PCDO("pcdo"),
    ENVDO("envdo");

    override fun toString(): String {
        return estado
    }
}