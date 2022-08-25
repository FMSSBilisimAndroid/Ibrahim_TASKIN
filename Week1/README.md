# Namespace Nedir?
Aynı amaca hizmet eden özellikleri, sınıfları ve fonksiyonları bir çatı altında toplarken, bu çatıya verdiğimiz isime isim alanı (namespace) denir.
Bir namespace içerisine birbiriyle alakalı sınıf ve foksiyonları koymaya dikkat ederiz.

## Namespace neden önemlidir?
Her sorun gibi, namespace kavramı da bir ihtiyaçtan doğmuştur. Nesne tabanlı dillerden önce (örneğin C dilinde) oluşturduğumuz bir sınıf veya değişken ismi proje genelinde bir daha kullanılamamaktaydı. Bu sebeple büyük projelerde, ekip halinde geliştirilen uygulamalarda isimleri standart halde tutmak ve kod okunabilirliğini sağlamak bir hayli zordu.

Bu karmaşıklığı önlemek için, benzer özellikte işleve sahip kod blokları, bir namespace altında toplanmış ve kullanılmak istenilen sınıfa ait namespace kod sayfasına eklendikten sonra kullanılabilir hale gelmiştir.
