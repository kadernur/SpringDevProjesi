# SpringDevProjesi
![image](https://user-images.githubusercontent.com/63293055/233456186-f01222b4-de7e-4a14-b6b8-50a1ca8c60dc.png)

# Adayların iş verenlerle buluştuğu bir platform projesidir.
<br> Bu projede n katmanlı mimari kullanılmıştır. Proje boyunca Clean code yazma amacı ile SOLİD prensiplerini göz önüne alarak "Code Refactoring" yaparak ilerleme sağlayacağım. Projede Java Spring Boot kullanılmıştır.

### :loud_sound::boom: GÜNCELLEME(20.04.2023)
:purple_circle: İş birimlerinin getirdiği kabul kriterlerini kapsayan iş kuralları için business katmanında rules paketi oluşturularak Brand nesnesine ait kurallar eklendi.

:purple_circle: Validasyon işlemi gerçekleştirildi.

:purple_circle: Exceptionlar için core katmanında paket oluşturulup son kullanıcıya verilen bilgi formatı düzenlenerek hata işlemleri  halledildi.

:purple_circle: Projede response request pattern'e göre classlar oluşturuldu.

:purple_circle: Core katmanı yazılarak projeye modelmapper eklendi.

:purple_circle:Projenin Technology ve language sınıflarına ait CRUD operasyonlar iş kuralları çerçevesinde swagger.ui 'de test edilip gerekli fonksiyonların başarılı şekilde çalışması kontrol edildi. Hatalar durumunda hata mesajları global hale getirilip projede test edildi.


### :loud_sound::boom: GÜNCELLEME(09.11.2022)

:purple_circle: Sisteme programlama dillerine ait alt teknolojiler eklenebilmeli, silinebilmeli. güncellenebilmeli, listelenebilmelidir.<br>
Örneğin; Java : Spring, JSP.<br>
C#: WPF, ASP.NET ,<br>
JavaScript : Vue, React.<br>
:purple_circle: InMemoryResponse silinerek yerine veritabanı işlemleri eklendi.

:purple_circle: Hibernate/JPA ile veritabanı tablo ilişkileri kuruldu.<br>
:purple_circle: lombak kurulumu yapılarak projede daha az kod bloğu kullanmak adına kullanıldı.<br>

### :loud_sound::boom: GÜNCELLEME(02.11.2022)
:purple_circle:  Sistemde programlama dillerini tutmaktadır.
Programlama dillerini(C#,Java,Python) ekleyebilecek, silebilecek, güncelleyebilecek, listeleyebilecek, id ile getirebilecek kodları içerir. Bunu tamamen in memory bir yapıda (şimdilik).
<br>
İş kuralları ise;
 + İsimler takrar edemez.
 + Programlama dili boş geçilemez.(Validation kullanılmadan algoritmik olarak halledilmiştir.)
 
 
 
<br> <h4>Projenin şu aşamadaki haline dair bazı  görseller:</h4>

![image](https://user-images.githubusercontent.com/63293055/233463918-2b548840-4d87-4812-a185-f230aa187cc1.png)

![image](https://user-images.githubusercontent.com/63293055/233464009-a9280fa1-2e08-42fb-a403-d27ebd9cbeb7.png)

![image](https://user-images.githubusercontent.com/63293055/233464467-b5d20668-f14a-4c82-adcd-364d9ecd448a.png)

![image](https://user-images.githubusercontent.com/63293055/233464210-c3a99006-7235-4c28-8d4b-9e595e944379.png)


![image](https://user-images.githubusercontent.com/63293055/200069453-72e19263-c5bb-49bd-a24b-bc83314f0c7b.png)
![image](https://user-images.githubusercontent.com/63293055/200069356-b212da74-4539-487c-850b-968461fadc66.png) <br><br>


![image](https://user-images.githubusercontent.com/63293055/200920897-f2e74349-e5a9-4e25-a2dc-b3aa49059ad1.png)
![image](https://user-images.githubusercontent.com/63293055/200920995-16673277-9f1c-4868-9058-b8d3bdb53d46.png)
![image](https://user-images.githubusercontent.com/63293055/200921109-bed5cc89-0e5c-45f1-8164-be9dd32c8ac0.png)

## İçindekiler
 ### BUSİNESS KATMANI

Bu katmanda iş kodlarımı yazdım.
  + [Abstract:open_file_folder:  :(İlgili soyut Sınıflarımı içerir.)](https://github.com/kadernur/SpringDevProjesi/tree/main/Devs/src/main/java/kodlama/io/Devs/business)
    + TechnologService.java
    + LanguageService.java

  + [ Concrete:open_file_folder: : (Somut sınıflarımı içerir.)](https://github.com/kadernur/SpringDevProjesi/tree/main/Devs/src/main/java/kodlama/io/Devs/business/concretes)
  
    + TechnologyManager.java
    + LanguageManager.java
  
 + [Requests:open_file_folder:  :(Bu dosya projedeki request pattern'lere uygun yazım için ilgili classları içeren dosyamız.)](https://github.com/kadernur/SpringDevProjesi/tree/main/Devs/src/main/java/kodlama/io/Devs/business/requests)
   + CreateLanguageRequests.java
   + CreateTechnologyRequests.java
   + TechnologyRequest.java
   + LanguageRequest.java
   + UpdateLanguageRequests.java
   + UpdateTechnologyRequests.java
   
 + [Responses:open_file_folder: :(Bu dosya projedeki response pattern'lere uygun yazım için ilgili classları içeren dosyamız.)](https://github.com/kadernur/SpringDevProjesi/tree/main/Devs/src/main/java/kodlama/io/Devs/business/responses)
   + GetAllLanguagesResponse.java
   + GetAllTechnologiesResponse.java
   + GetByIdLanguagesResponse.java
   + GetByIdTechnologiesResponse.java
   + LanguageResponse.java
   + TechnologiesResponse.java
   
   
 ###  CORE KATMANI
Evrensel kodlarımızı kullandığımız  katmanımızdır.  
Core katmanı diğer katmanları referans almaz.
+ [mappers:open_file_folder:  :(Bu katmanda mapper dosyası ile ModelMapper işlevlerini sağlayacak classlar yer almaktadır.)](https://github.com/kadernur/SpringDevProjesi/tree/main/Devs/src/main/java/kodlama/io/Devs/core/utilities/mappers)
  + ModelMapperManager.java
  + ModelMapperService.java
   
+ [Exceptions:open_file_folder:  :(Bu katmandaexceptions dosyası ile Hata işlevlerini sağlayacak classlar yer almaktadır.)](https://github.com/kadernur/SpringDevProjesi/tree/main/Devs/src/main/java/kodlama/io/Devs/core/exceptions)
  + BusinessException.java
  + ProblemDetails.java
  + ValidationProblemDetails.java
  + JpaObjectRetrievalProblemDetails.java
  + NullPointerProblemDetails.java
  
  
 ### DATA ACCESS KATMANI 
Veriye ulaşmak için yazdığım katman kısacası SQL kodlarımın mevcut olduğu katman.

 + [Abstract:open_file_folder:  :(İlgili soyut Sınıflarımı içerir. Bu klasörde bulunan repository classlarında ilişkisel model (veritabanı modeli) ile nesne modeli(Java nesnesi) arasında bir köprü oluşturan JPA kullanılmıştır. )](https://github.com/kadernur/SpringDevProjesi/tree/main/Devs/src/main/java/kodlama/io/Devs/dataAccess/abstracts)
 
   + LanguageRepository.java
   + TechnologyRepository.java
  
 ### ENTİTİES
 Bu katman yardımcı katmanımdır. Veri tabanına ait nesneleri tutar.
+ [Concrete:open_file_folder:  : (Somut sınıflarımı içerir.)](https://github.com/kadernur/SpringDevProjesi/tree/main/Devs/src/main/java/kodlama/io/Devs/entities/concretes)
   + Language.java
   + Technology.java
   
 ###  WebAPI  
[Sadece veri transferi için kullanılır.RestFull mimarisini destekleyen katmandır. bu katmandaki Controller gelen bütün istekleri karşılar.(RESFUL: Http protokolü:Bir kaynağa ulaşmak için izlediğimiz yol diyebiliriz.)](https://github.com/kadernur/SpringDevProjesi/tree/main/Devs/src/main/java/kodlama/io/Devs/webApi/controllers)
   + LanguageController.java
   + TechnologyController.java
   
  


