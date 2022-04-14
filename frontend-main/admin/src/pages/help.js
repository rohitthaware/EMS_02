import './cards.css'

const Help = () => {
  return (
    <div className="card-help">
      <div className="mb-3">
        <br/><br/><br/>
        <div className=""></div>
        <table className="table table-sm">
          <tr><td colSpan="3"><center><h3>Contact</h3></center></td></tr>
          <tr><th>Email </th><td>:-</td><td>companyname@gmail.com</td></tr>
          <tr><th>Tel-Phone </th><td>:-</td><td>(000) 123-4567 </td></tr>
          <tr><th>Technical Support</th><td>:-</td><td>(000) 999-9999 </td></tr>
          <tr><th>LinkedIn</th><td>:-</td><td>LinkedIn.com/companyname </td></tr>
          <tr><th>Address</th><td>:-</td><td>Magarpatta Pune, Maharashtra</td></tr>
        </table>
      </div>
    </div>
  )
}

export default Help